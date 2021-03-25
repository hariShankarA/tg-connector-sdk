package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBCardSchemeName {

	AMERICAN_EXPRESS("AmericanExpress"), DINERS("Diners"), DISCOVER("Discover"), MASTER_CARD("MasterCard"), VISA("VISA"); 

	private final String value;

	private OBCardSchemeName(String value) {
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

	public static OBCardSchemeName fromValue(String text) {
		for (OBCardSchemeName b : OBCardSchemeName.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
