package com.ecd.mlapi.model;

public class Answer {

	public static final String PATH = "/answers";

	private Long question_id;
	private String text;

	public Answer() {
		// Do Nothing
	}

	public Answer(Long question_id, String text) {
		this.question_id = question_id;
		this.text = text;
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
