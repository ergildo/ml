package com.ecd.mlapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_EMPTY)
public class Item {

	public static final String PATH = "/items";

	private String id;
	private String title;
	private String category_id;
	private String official_store_id;
	private String price;
	private String currency_id;
	private Integer available_quantity;
	private String status;
	private String buying_mode;
	private String listing_type_id;
	private String condition;
	private String description;
	private String video_id;
	private String warranty;
	private Shipping shipping;
	private List<Picture> pictures;

	private List<Attribute> attributes;

	public static Item newModificableInstance(Item item) {
		return new Item(item.getTitle(), item.getDescription(), item.getPrice(), item.getAvailable_quantity(),
				item.getPictures());
	}

	public Item() {

	}

	private Item(String title, String description, String price, Integer available_quantity, List<Picture> pictures) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.available_quantity = available_quantity;
		this.pictures = pictures;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}

	public Integer getAvailable_quantity() {
		return available_quantity;
	}

	public void setAvailable_quantity(Integer available_quantity) {
		this.available_quantity = available_quantity;
	}

	public String getBuying_mode() {
		return buying_mode;
	}

	public void setBuying_mode(String buying_mode) {
		this.buying_mode = buying_mode;
	}

	public String getListing_type_id() {
		return listing_type_id;
	}

	public void setListing_type_id(String listing_type_id) {
		this.listing_type_id = listing_type_id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVideo_id() {
		return video_id;
	}

	public void setVideo_id(String video_id) {
		this.video_id = video_id;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public String getOfficial_store_id() {
		return official_store_id;
	}

	public void setOfficial_store_id(String official_store_id) {
		this.official_store_id = official_store_id;
	}

}
