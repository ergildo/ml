package com.ecd.mlapi.model;

public class AccessToken {
	public static final String PARAM = "access_token";
	private String accessToken;
	private String refreshToken;
	private Long expiresIn;
	private String scope;
	private String userId;
	private String tokenType;

	public AccessToken(String accessToken, String refreshToken) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}

	public AccessToken(String accessToken, String refreshToken, Long expiresIn, String scope, String userId,
			String tokenType) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.expiresIn = expiresIn;
		this.scope = scope;
		this.userId = userId;
		this.tokenType = tokenType;
	}

	public AccessToken() {

	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

}
