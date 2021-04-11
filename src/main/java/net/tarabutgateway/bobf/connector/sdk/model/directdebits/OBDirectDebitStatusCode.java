package net.tarabutgateway.bobf.connector.sdk.model.directdebits;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBDirectDebitStatusCode {

	ACTIVE("Active"), INACTIVE("Inactive");

	private final String value;

	private OBDirectDebitStatusCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBDirectDebitStatusCode fromName(String text) {
		for (OBDirectDebitStatusCode b : OBDirectDebitStatusCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
