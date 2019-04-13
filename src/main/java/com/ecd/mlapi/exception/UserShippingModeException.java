package com.ecd.mlapi.exception;

public class UserShippingModeException extends MercadoLivreException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8255905358167032911L;

	public UserShippingModeException() {
		super("Usuário não autenticado");
	}
}
