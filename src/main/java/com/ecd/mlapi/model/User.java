package com.ecd.mlapi.model;

public class User {
	public static final String PATH = "/users";
	private String id;
	private String first_name;
	private String last_name;
	private String nickname;
	private String registration_date;
	private String country_id;
	private String logo;
	private String points;
	private String site_id;
	private String permalink;
	private String[] tags;
	private SimpleAddress address;
	private UserStatus status;
	private Phone phone;
	private Phone alternative_phone;
	private BillingInfo billing_info;
	private Identification identification;
	private String user_type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public SimpleAddress getAddress() {
		return address;
	}

	public void setAddress(SimpleAddress address) {
		this.address = address;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Phone getAlternative_phone() {
		return alternative_phone;
	}

	public void setAlternative_phone(Phone alternative_phone) {
		this.alternative_phone = alternative_phone;
	}

	public BillingInfo getBilling_info() {
		return billing_info;
	}

	public void setBilling_info(BillingInfo billing_info) {
		this.billing_info = billing_info;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public Identification getIdentification() {
		return identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

}
