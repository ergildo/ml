package com.ecd.mlapi.model;

import java.util.List;

public class Shipping {

	private String id;
	private String site_id;
	private String shipment_type;
	private String mode;
	private String shipping_mode;
	private String tracking_number;
	private String tracking_method;
	boolean local_pick_up;
	boolean free_shipping;
	private ShippingStatus status;
	private ShippingOperation shipping_option;
	private Address receiver_address;
	private List<ShippingFreeMethod> free_methods;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getShipment_type() {
		return shipment_type;
	}

	public void setShipment_type(String shipment_type) {
		this.shipment_type = shipment_type;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getShipping_mode() {
		return shipping_mode;
	}

	public void setShipping_mode(String shipping_mode) {
		this.shipping_mode = shipping_mode;
	}

	public boolean isLocal_pick_up() {
		return local_pick_up;
	}

	public void setLocal_pick_up(boolean local_pick_up) {
		this.local_pick_up = local_pick_up;
	}

	public boolean isFree_shipping() {
		return free_shipping;
	}

	public void setFree_shipping(boolean free_shipping) {
		this.free_shipping = free_shipping;
	}

	public ShippingStatus getStatus() {
		return status;
	}

	public void setStatus(ShippingStatus status) {
		this.status = status;
	}

	public ShippingOperation getShipping_option() {
		return shipping_option;
	}

	public void setShipping_option(ShippingOperation shipping_option) {
		this.shipping_option = shipping_option;
	}

	public Address getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(Address receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getTracking_number() {
		return tracking_number;
	}

	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
	}

	public String getTracking_method() {
		return tracking_method;
	}

	public void setTracking_method(String tracking_method) {
		this.tracking_method = tracking_method;
	}

	public List<ShippingFreeMethod> getFree_methods() {
		return free_methods;
	}

	public void setFree_methods(List<ShippingFreeMethod> free_methods) {
		this.free_methods = free_methods;
	}

}
