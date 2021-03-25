package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBCardAuthorizationType {

	CONSUMER_DEVICE("ConsumerDevice"), CONTACTLESS("Contactless"), NONE("None"), PIN("PIN");

	private final String value;

	private OBCardAuthorizationType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OBCardAuthorizationType fromValue(String text) {
		for (OBCardAuthorizationType b : OBCardAuthorizationType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
