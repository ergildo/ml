package com.ecd.mlapi.service;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.model.AccessToken;
import com.mercadolibre.sdk.AuthorizationFailure;
import com.mercadolibre.sdk.MeliException;

public class AuthenticationService {

	private MercadoLivreApiContext context;

	private AuthenticationService(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static AuthenticationService getInstance(MercadoLivreApiContext context) {
		return new AuthenticationService(context);
	}

	public String getAuthUrl(String redirectUri) throws MeliException, AuthorizationFailure {

		return context.getAuthUrl(redirectUri);

	}

	public AccessToken authorize(String redirectUri, String code) throws MercadoLivreException {
		return context.authorize(redirectUri, code);
	}

	public AccessToken refreshToken() throws MercadoLivreException {
		return context.refreshToken();
	}

}
