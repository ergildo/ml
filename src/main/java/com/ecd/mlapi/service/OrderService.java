package com.ecd.mlapi.service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.ecd.mlapi.context.MercadoLivreApiContext;
import com.ecd.mlapi.exception.MercadoLivreException;

public class OrderService {

	private MercadoLivreApiContext context;

	private OrderService(MercadoLivreApiContext context) {
		this.context = context;
	}

	public static OrderService getInstance(MercadoLivreApiContext context) {
		return new OrderService(context);
	}

	public InputStream getTag(String... id) throws MercadoLivreException {
		Map<String, String[]> params = new HashMap<String, String[]>();
		params.put("shipment_ids", id);
		return context.getStream("/shipment_labels", params);
	}

}
