package com.ecd.mlapi.service;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.model.User;

public class NotificationService {

	private MercadoLivreApiContext context;

	private NotificationService(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static NotificationService getInstance(MercadoLivreApiContext context) {
		return new NotificationService(context);
	}

	public User getUser(String id) throws Exception {
		String path = User.PATH + "/" + id;
		return context.get(User.class, path);
	}

}
