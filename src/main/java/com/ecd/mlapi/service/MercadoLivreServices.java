package com.ecd.mlapi.service;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.model.FilePicture;
import com.ecd.mlapi.model.Picture;

public class MercadoLivreServices {

	private MercadoLivreApiContext context;

	private MercadoLivreServices(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static MercadoLivreServices getInstance(MercadoLivreApiContext context) {
		return new MercadoLivreServices(context);
	}

	public AuthenticationService getAuthenticationService() {
		return AuthenticationService.getInstance(context);
	}

	public <T> T getResource(Class<T> entity, String path) throws MercadoLivreException {
		return context.get(entity, path);
	}

	public Picture upload(FilePicture picture) throws MercadoLivreException {
		return context.upload(picture);
	}

	public UserService getUserService() {
		return UserService.getInstance(context);
	}

	public ItemService getItemService() {
		return ItemService.getInstance(context);
	}

	public CategoryService getCategoryService() {
		return CategoryService.getInstance(context);
	}

	public AnswerService getAnswerService() {
		return AnswerService.getInstance(context);
	}

	public NotificationService getNotificationService() {
		return NotificationService.getInstance(context);
	}

	public OrderService getOrderService() {
		return OrderService.getInstance(context);
	}
}
