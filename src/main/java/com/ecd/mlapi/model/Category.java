package com.ecd.mlapi.model;

import java.util.List;

public class Category {

	public static final String PATH = "/categories";

	private String id;
	private String name;
	private List<Category> children_categories;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getChildren_categories() {
		return children_categories;
	}

	public void setChildren_categories(List<Category> children_categories) {
		this.children_categories = children_categories;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", name=" + name + ", children_categories=" + children_categories + "]";
	}

}
