package net.tarabutgateway.bobf.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBCardSchemeName {

	AMERICAN_EXPRESS("AmericanExpress"), DINERS("Diners"), DISCOVER("Discover"), MASTER_CARD("MasterCard"),
	VISA("VISA");

	private final String value;

	private OBCardSchemeName(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBCardSchemeName fromName(String text) {
		for (OBCardSchemeName b : OBCardSchemeName.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
