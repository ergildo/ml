package com.ecd.mlapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Picture {

	private String id;
	private String source;
	private String max_size;
	private List<PictureVariation> variations;

	@JsonIgnore
	public String getUrl() {
		for (PictureVariation variation : variations) {
			if (variation.getSize().equals(max_size)) {
				return variation.getUrl();
			}
		}
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMax_size() {
		return max_size;
	}

	public void setMax_size(String max_size) {
		this.max_size = max_size;
	}

	public List<PictureVariation> getVariations() {
		return variations;
	}

	public void setVariations(List<PictureVariation> variations) {
		this.variations = variations;
	}

}
