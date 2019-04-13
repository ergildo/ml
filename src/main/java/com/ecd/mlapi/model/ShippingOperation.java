package com.ecd.mlapi.model;

public class ShippingOperation {
	private String id;
	private String name;
	private String currency_id;
	private String list_cost;
	private String cost;
	private String speed;

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

	public String getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}

	public String getList_cost() {
		return list_cost;
	}

	public void setList_cost(String list_cost) {
		this.list_cost = list_cost;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
}
