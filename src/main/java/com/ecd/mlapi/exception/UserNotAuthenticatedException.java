package com.ecd.mlapi.exception;

public class UserNotAuthenticatedException extends MercadoLivreException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8255905358167032911L;

	public UserNotAuthenticatedException() {
		super("Usuário não autenticado");
	}
}
