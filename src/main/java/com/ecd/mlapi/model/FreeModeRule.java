package com.ecd.mlapi.model;

import java.util.List;

public class FreeModeRule {
	private FreeMode free_mode;
	private List<String> value;

	public FreeMode getFree_mode() {
		return free_mode;
	}

	public void setFree_mode(FreeMode free_mode) {
		this.free_mode = free_mode;
	}

	public List<String> getValue() {
		return value;
	}

	public void setValue(List<String> value) {
		this.value = value;
	}
}
