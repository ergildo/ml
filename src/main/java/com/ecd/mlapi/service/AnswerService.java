package com.ecd.mlapi.service;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;
import com.ecd.mlapi.model.Answer;

public class AnswerService {

	private MercadoLivreApiContext context;

	private AnswerService(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static AnswerService getInstance(MercadoLivreApiContext context) {
		return new AnswerService(context);
	}

	public Answer answer(Answer answer) throws MercadoLivreException {

		return context.post(Answer.class, Answer.PATH, answer);
	}

}
