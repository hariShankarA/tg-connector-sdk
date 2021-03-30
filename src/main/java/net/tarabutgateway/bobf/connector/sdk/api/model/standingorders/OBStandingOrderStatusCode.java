package net.tarabutgateway.bobf.connector.sdk.api.model.standingorders;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBStandingOrderStatusCode {

	ACTIVE("Active"), INACTIVE("Inactive");

	private final String value;

	private OBStandingOrderStatusCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBStandingOrderStatusCode fromName(String text) {
		for (OBStandingOrderStatusCode b : OBStandingOrderStatusCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
