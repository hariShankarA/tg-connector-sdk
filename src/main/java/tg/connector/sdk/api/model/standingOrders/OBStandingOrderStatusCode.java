package tg.connector.sdk.api.model.standingOrders;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBStandingOrderStatusCode {

	ACTIVE("Active"), INACTIVE("Inactive");

	private final String value;

	private OBStandingOrderStatusCode(String value) {
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

	public static OBStandingOrderStatusCode fromValue(String text) {
		for (OBStandingOrderStatusCode b : OBStandingOrderStatusCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
