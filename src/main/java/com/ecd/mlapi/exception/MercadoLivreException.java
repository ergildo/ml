package com.ecd.mlapi.exception;

import com.ecd.mlapi.model.Error;

public class MercadoLivreException extends Exception {
	private Error error;

	public MercadoLivreException(Error error) {
		this(error.toString());
		this.error = error;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4086850734567296349L;

	public MercadoLivreException(String message) {
		super(message);
	}

	public MercadoLivreException(Exception e) {
		super(e);
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
