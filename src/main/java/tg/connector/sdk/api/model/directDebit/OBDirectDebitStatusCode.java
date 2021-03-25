package tg.connector.sdk.api.model.directDebit;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBDirectDebitStatusCode {

	ACTIVE("Active"), INACTIVE("Inactive");

	private final String value;

	private OBDirectDebitStatusCode(String value) {
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

	public static OBDirectDebitStatusCode fromValue(String text) {
		for (OBDirectDebitStatusCode b : OBDirectDebitStatusCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
