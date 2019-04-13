package com.ecd.mlapi.model;

import java.util.Arrays;

public class Error {

	private String message;
	private String error;
	private Integer status;
	private Cause[] cause;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Cause[] getCause() {
		return cause;
	}

	public void setCause(Cause[] cause) {
		this.cause = cause;
	}

	@Override
	public String toString() {
		return "message=" + message + ", error=" + error + ", status=" + status + " causes=" + Arrays.toString(cause);
	}

}
