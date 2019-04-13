package com.ecd.mlapi.model;

public class Address {
	private Long id;
	private String address_line;
	private String street_name;
	private String street_number;
	private Neighborhood neighborhood;
	private String comment;
	private String zip_code;
	private String latitude;
	private String longitude;
	private String geolocation_type;
	private String receiver_name;
	private String receiver_phone;
	private City city;
	private State state;
	private Country country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress_line() {
		return address_line;
	}

	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getStreet_number() {
		return street_number;
	}

	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getGeolocation_type() {
		return geolocation_type;
	}

	public void setGeolocation_type(String geolocation_type) {
		this.geolocation_type = geolocation_type;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_phone() {
		return receiver_phone;
	}

	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

}
