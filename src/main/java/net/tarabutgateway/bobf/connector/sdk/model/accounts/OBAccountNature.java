package net.tarabutgateway.bobf.connector.sdk.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBAccountNature {

	TRANSACTIONAL("Transactional");

	private final String value;

	private OBAccountNature(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBAccountNature fromName(String text) {
		for (OBAccountNature b : OBAccountNature.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
