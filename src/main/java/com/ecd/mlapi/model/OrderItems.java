package com.ecd.mlapi.model;

import java.math.BigDecimal;

public class OrderItems {
	private Integer quantity;
	private BigDecimal unit_price;
	private String currency_id;
	private Item item;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
	}

	public String getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
