package com.ecd.mlapi.context;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.http.HttpStatus;

import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.exception.UserNotAuthenticatedException;
import com.ecd.mlapi.model.AccessToken;
import com.ecd.mlapi.model.AppClient;
import com.ecd.mlapi.model.Error;
import com.ecd.mlapi.model.FilePicture;
import com.ecd.mlapi.model.Picture;
import com.ecd.mlapi.service.PictureUploadUtil;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadolibre.sdk.AuthorizationFailure;
import com.mercadolibre.sdk.Meli;
import com.mercadolibre.sdk.MeliException;
import com.ning.http.client.FluentStringsMap;
import com.ning.http.client.Response;

public class MercadoLivreApiContext {

	private Meli meli;

	private ObjectMapper mapper;

	public static MercadoLivreApiContext getInstance(AppClient appClient, AccessToken accessToken) {
		return new MercadoLivreApiContext(appClient, accessToken);
	}

	public static MercadoLivreApiContext getInstance(AppClient appClient) {
		return new MercadoLivreApiContext(appClient, new AccessToken());
	}

	private MercadoLivreApiContext(AppClient appClient, AccessToken accessToken) {
		meli = new Meli(appClient.getClientId(), appClient.getClientSecret(), accessToken.getAccessToken(),
				accessToken.getRefreshToken());
		mapper = getObjectMapper();
	}

	public <T> T get(Class<T> entity, String path) throws MercadoLivreException {
		try {
			valideAuthentication();
			Response response = meli.get(path, getParams());
			valideResponse(response);
			return getResponseAsEntity(response, entity);

		} catch (Exception e) {
			throw new MercadoLivreException(e);
		}
	}

	public <T> T get(Class<T> entity, String path, Map<String, String[]> params) throws MercadoLivreException {
		Response response = get(path, params);
		return getResponseAsEntity(response, entity);
	}

	private Response get(String path, Map<String, String[]> params) throws MercadoLivreException {
		try {
			valideAuthentication();
			FluentStringsMap p = new FluentStringsMap();

			for (String key : params.keySet()) {
				p.add(key, params.get(key));
			}
			p.add(AccessToken.PARAM, meli.getAccessToken());
			Response response = meli.get(path, p);
			valideResponse(response);
			return response;

		} catch (Exception e) {
			throw new MercadoLivreException(e);
		}
	}

	public InputStream getStream(String path, Map<String, String[]> params) throws MercadoLivreException {
		try {
			return get(path, params).getResponseBodyAsStream();
		} catch (IOException e) {
			throw new MercadoLivreException(e);
		}
	}

	public <T> T post(Class<T> entity, String path, Object body) throws MercadoLivreException {
		try {
			valideAuthentication();
			Response response = meli.post(path, getParams(), toJson(body));
			valideResponse(response);
			return getResponseAsEntity(response, entity);

		} catch (Exception e) {
			throw new MercadoLivreException(e);
		}
	}

	public <T> T put(Class<T> entity, String path, Object body) throws MercadoLivreException {
		try {
			valideAuthentication();
			Response response = meli.put(path, getParams(), toJson(body));
			valideResponse(response);
			return getResponseAsEntity(response, entity);

		} catch (Exception e) {
			throw new MercadoLivreException(e);
		}
	}

	public <T> T delete(Class<T> entity, String path, Object body) throws MercadoLivreException {
		try {
			valideAuthentication();
			Response response = meli.delete(path, getParams());
			return getResponseAsEntity(response, entity);

		} catch (Exception e) {
			throw new MercadoLivreException(e);
		}
	}

	public String getAuthUrl(String redirectUri) throws MeliException, AuthorizationFailure {

		return meli.getAuthUrl(redirectUri, Meli.AuthUrls.MLB);

	}

	public AccessToken authorize(String redirectUri, String code) throws MercadoLivreException {
		try {

			meli.authorize(code, redirectUri);

			return getAccessToken();

		} catch (AuthorizationFailure e) {
			throw new MercadoLivreException(e);
		}
	}

	public AccessToken refreshToken() throws MercadoLivreException {
		try {
			meli.refreshAccessToken();
			return getAccessToken();
		} catch (AuthorizationFailure e) {
			throw new MercadoLivreException(e);
		}
	}

	public Picture upload(FilePicture picture) throws MercadoLivreException {
		return PictureUploadUtil.upload(picture, meli);
	}

	private AccessToken getAccessToken() {
		return new AccessToken(meli.getAccessToken(), meli.getRefreshToken(), meli.getExpiresIn(), meli.getScope(),
				meli.getUserId(), meli.getTokenType());
	}

	private ObjectMapper getObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		// objectMapper.configure( SerializationFeature., state)
		return objectMapper;
	}

	private void valideResponse(Response response) throws MercadoLivreException, IOException {
		if (!isSuccessStatus(response)) {
			throwNewError(response);
		}
	}

	private boolean isSuccessStatus(Response response) {
		return isOkStatus(response) || isCreatedStatus(response) || isAcceptedStatus(response);
	}

	private boolean isOkStatus(Response response) {
		return response.getStatusCode() == HttpStatus.SC_OK;
	}

	private boolean isCreatedStatus(Response response) {

		return response.getStatusCode() == HttpStatus.SC_CREATED;
	}

	private boolean isAcceptedStatus(Response response) {

		return response.getStatusCode() == HttpStatus.SC_ACCEPTED;
	}

	private void throwNewError(Response response) throws MercadoLivreException, IOException {
		Error error = getResponseAsEntity(response, Error.class);
		throw new MercadoLivreException(error);
	}

	private void valideAuthentication() throws UserNotAuthenticatedException {
		if (!isAuthenticated()) {
			throw new UserNotAuthenticatedException();
		}
	}

	public boolean isAuthenticated() {
		return meli.getAccessToken() != null;
	}

	private FluentStringsMap getParams() {
		FluentStringsMap params = new FluentStringsMap();
		params.add(AccessToken.PARAM, meli.getAccessToken());
		return params;
	}

	private <T> T getResponseAsEntity(Response response, Class<T> type) throws MercadoLivreException {
		try {
			return fromJson(response.getResponseBody(), type);
		} catch (IOException e) {
			throw new MercadoLivreException(e);
		}
	}

	private <T> T fromJson(String responseBody, Class<T> type)
			throws JsonParseException, JsonMappingException, IOException {

		return mapper.readValue(responseBody, type);
	}

	private String toJson(Object body) throws JsonProcessingException {
		return mapper.writeValueAsString(body);
	}

}
