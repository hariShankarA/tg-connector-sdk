package tg.connector.sdk.api.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBCreditDebitCode {

	CREDIT("Credit"), DEBIT("Debit");

	private final String value;

	private OBCreditDebitCode(String value) {
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

	public static OBCreditDebitCode fromValue(String text) {
		for (OBCreditDebitCode b : OBCreditDebitCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
