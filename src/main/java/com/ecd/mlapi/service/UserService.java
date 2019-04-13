package com.ecd.mlapi.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.model.Brands;
import com.ecd.mlapi.model.User;
import com.ecd.mlapi.model.UserShippingMode;

public class UserService {

	private MercadoLivreApiContext context;

	private UserService(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static UserService getInstance(MercadoLivreApiContext context) {
		return new UserService(context);
	}

	public User getUser(String id) throws MercadoLivreException {
		String path = User.PATH + "/" + id;
		return context.get(User.class, path);
	}

	public Brands getBrands(String userId) {
		try {
			String path = User.PATH + "/" + userId + "/brands";
			return context.get(Brands.class, path);
		} catch (MercadoLivreException e) {
			return null;
		}
	}

	public User getUser() throws MercadoLivreException {
		return context.get(User.class, User.PATH + "/me");
	}

	public List<UserShippingMode> getShippingMode(String userId, String categoryId) throws MercadoLivreException {
		Map<String, String[]> params = new HashMap<String, String[]>();
		params.put("category_id", new String[] { categoryId });

		UserShippingMode[] userShippingModes = context.get(UserShippingMode[].class,
				User.PATH + "/" + userId + "/shipping_modes", params);

		return Arrays.asList(userShippingModes);
	}

}
