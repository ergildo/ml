package com.ecd.mlapi.model;

public class Question {

	private Long id;
	private String seller_id;
	private String text;
	private QuestionStatus status;
	private String item_id;
	private String date_created;
	private String hold;
	private String deleted_from_listing;
	private Answer answer;
	private From from;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public QuestionStatus getStatus() {
		return status;
	}

	public void setStatus(QuestionStatus status) {
		this.status = status;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getHold() {
		return hold;
	}

	public void setHold(String hold) {
		this.hold = hold;
	}

	public String getDeleted_from_listing() {
		return deleted_from_listing;
	}

	public void setDeleted_from_listing(String deleted_from_listing) {
		this.deleted_from_listing = deleted_from_listing;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}
}
