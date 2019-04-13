/**
 * 
 */
package com.ecd.mlapi.model;

import java.util.Date;

/**
 * @author ergildo.cdias
 *
 */
public class Order {

	private String id;
	private Date date_created;
	private Date date_closed;
	private Date last_updated;
	private String total_amount;
	private String total_amount_with_shipping;
	private String paid_amount;
	private String currency_id;
	private String status;
	private Shipping shipping;

	private OrderItems[] order_items;
	private User buyer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Date getDate_closed() {
		return date_closed;
	}

	public void setDate_closed(Date date_closed) {
		this.date_closed = date_closed;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getTotal_amount_with_shipping() {
		return total_amount_with_shipping;
	}

	public void setTotal_amount_with_shipping(String total_amount_with_shipping) {
		this.total_amount_with_shipping = total_amount_with_shipping;
	}

	public String getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(String paid_amount) {
		this.paid_amount = paid_amount;
	}

	public OrderItems[] getOrder_items() {
		return order_items;
	}

	public void setOrder_items(OrderItems[] order_items) {
		this.order_items = order_items;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public String getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
