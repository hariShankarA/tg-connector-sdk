package net.tarabutgateway.bobf.connector.sdk.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBCardAuthorizationType {

	CONSUMER_DEVICE("ConsumerDevice"), CONTACTLESS("Contactless"), NONE("None"), PIN("PIN");

	private final String value;

	private OBCardAuthorizationType(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBCardAuthorizationType fromName(String text) {
		for (OBCardAuthorizationType b : OBCardAuthorizationType.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
