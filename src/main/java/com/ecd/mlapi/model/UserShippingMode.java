package com.ecd.mlapi.model;

public class UserShippingMode {
	private String mode;

	public UserShippingMode() {

	}

	public UserShippingMode(String mode) {
		this.mode = mode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mode == null) ? 0 : mode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserShippingMode other = (UserShippingMode) obj;
		if (mode == null) {
			if (other.mode != null)
				return false;
		} else if (!mode.equals(other.mode))
			return false;
		return true;
	}
}
