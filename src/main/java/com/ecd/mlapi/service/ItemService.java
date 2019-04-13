package com.ecd.mlapi.service;

import java.util.List;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.exception.UserShippingModeException;
import com.ecd.mlapi.model.Brand;
import com.ecd.mlapi.model.Brands;
import com.ecd.mlapi.model.Item;
import com.ecd.mlapi.model.User;
import com.ecd.mlapi.model.UserShippingMode;

public class ItemService {

	private MercadoLivreApiContext context;
	private UserService userService;

	private ItemService(MercadoLivreApiContext context) {
		this.context = context;
		this.userService = UserService.getInstance(context);
	}

	public static ItemService getInstance(MercadoLivreApiContext context) {
		return new ItemService(context);
	}

	public Item save(Item item) throws MercadoLivreException {
		userService = UserService.getInstance(context);
		User user = userService.getUser();

		allowShippingMode(item, user);

		Brands brands = userService.getBrands(user.getId());
		if (brands != null) {
			Brand brand = brands.getBrands().get(0);
			item.setOfficial_store_id(brand.getOfficial_store_id());
		}
		return context.post(Item.class, Item.PATH, item);

	}

	private boolean allowShippingMode(Item item, User user) throws MercadoLivreException {
		List<UserShippingMode> shippingModes = userService.getShippingMode(user.getId(), item.getCategory_id());
		UserShippingMode userShippingMode = new UserShippingMode(item.getShipping().getMode());
		for (UserShippingMode mode : shippingModes) {
			if (mode.equals(userShippingMode)) {
				return true;
			}
		}

		throw new UserShippingModeException();
	}

	public Item delete(String id) throws MercadoLivreException {
		Item item = new Item();
		item.setStatus("paused");
		return context.put(Item.class, Item.PATH + "/" + id, item);
	}

	public Item active(String id) throws MercadoLivreException {
		Item item = new Item();
		item.setStatus("active");
		return context.put(Item.class, Item.PATH + "/" + id, item);
	}

	public Item update(Item product) throws MercadoLivreException {

		String id = product.getId();

		return context.put(Item.class, Item.PATH + "/" + id, Item.newModificableInstance(product));

	}

}
