package com.ecd.mlapi.model;

import java.util.Date;
import java.util.List;

public class Brand {
	private String name;
	private String fantasy_name;
	private Date date_created;
	private String status;
	private List<Picture> pictures;
	private String type;
	private String official_store_id;
	private String site_id;
	private String return_policy;
	private String relevance_position;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFantasy_name() {
		return fantasy_name;
	}

	public void setFantasy_name(String fantasy_name) {
		this.fantasy_name = fantasy_name;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOfficial_store_id() {
		return official_store_id;
	}

	public void setOfficial_store_id(String official_store_id) {
		this.official_store_id = official_store_id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getReturn_policy() {
		return return_policy;
	}

	public void setReturn_policy(String return_policy) {
		this.return_policy = return_policy;
	}

	public String getRelevance_position() {
		return relevance_position;
	}

	public void setRelevance_position(String relevance_position) {
		this.relevance_position = relevance_position;
	}
}
