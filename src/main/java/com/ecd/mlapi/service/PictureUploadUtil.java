package com.ecd.mlapi.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.model.FilePicture;
import com.ecd.mlapi.model.Picture;
import com.google.gson.Gson;
import com.mercadolibre.sdk.Meli;

/**
 * @author ergildo.cdias
 *
 */
public class PictureUploadUtil {

	private static CloseableHttpClient httpclient = HttpClients.createDefault();

	public static Picture upload(FilePicture picture, Meli meli) throws MercadoLivreException {
		try {

			HttpPost post = getHttpPost(meli);

			HttpEntity entity = getHttpEntity(picture);

			post.setEntity(entity);

			HttpResponse response = httpclient.execute(post);

			return getResponseAsPicture(response);

		} catch (Exception e) {
			throw new MercadoLivreException(e);
		}
	}

	/**
	 * @param picture
	 * @return
	 */
	private static HttpEntity getHttpEntity(FilePicture picture) {
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addBinaryBody("file", picture.getFile(), ContentType.MULTIPART_FORM_DATA, picture.getFileName());

		HttpEntity entity = builder.build();
		return entity;
	}

	/**
	 * @param meli
	 * @return
	 */
	private static HttpPost getHttpPost(Meli meli) {
		HttpPost post = new HttpPost(Meli.apiUrl + "/pictures?access_token=" + meli.getAccessToken());
		return post;
	}

	/**
	 * @param response
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	private static Picture getResponseAsPicture(HttpResponse response) throws ParseException, IOException {
		String responseText = EntityUtils.toString(response.getEntity());
		return new Gson().fromJson(responseText, Picture.class);
	}
}
