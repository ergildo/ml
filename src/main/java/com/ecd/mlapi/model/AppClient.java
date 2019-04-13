package com.ecd.mlapi.model;

public class AppClient {

	private Long clientId;
	private String clientSecret;

	public AppClient() {
		this( 6036800682923396L, "5FbYAa5mwg5uVoixbuTVNE4FUFV3aInl");
	}

	private AppClient(Long clientId, String clientSecret) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	public Long getClientId() {
		return clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

}
