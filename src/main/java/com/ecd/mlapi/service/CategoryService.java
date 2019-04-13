package com.ecd.mlapi.service;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.model.Category;

public class CategoryService {

	private MercadoLivreApiContext context;

	private CategoryService(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static CategoryService getInstance(MercadoLivreApiContext context) {
		return new CategoryService(context);
	}

	public Category get(String id) throws MercadoLivreException {
		return context.get(Category.class, Category.PATH + "/" + id);
	}

	public Category save(Category item) throws MercadoLivreException {

		return context.post(Category.class, Category.PATH, item);

	}

	public Category delete(String id) throws MercadoLivreException {
		Category item = new Category();

		return context.delete(Category.class, Category.PATH + "/" + id, item);
	}

	public Category update(Category category) throws MercadoLivreException {

		String id = category.getId();

		return context.put(Category.class, Category.PATH + "/" + id, category);

	}

}
