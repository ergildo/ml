package com.ecd.mlapi.model;

import java.util.Date;

public class Notification {

	private String application_id;

	private String resource;
	private String user_id;
	private NotiticationType topic;
	private Date received;
	private Date sent;
	public String getAttempts() {
		return attempts;
	}

	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}

	private String attempts;

	public String getApplication_id() {
		return application_id;
	}

	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public NotiticationType getTopic() {
		return topic;
	}

	public void setTopic(NotiticationType topic) {
		this.topic = topic;
	}

	public Date getReceived() {
		return received;
	}

	public void setReceived(Date received) {
		this.received = received;
	}

	public Date getSent() {
		return sent;
	}

	public void setSent(Date sent) {
		this.sent = sent;
	}
}
