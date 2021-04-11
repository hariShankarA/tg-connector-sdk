package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBCreditDebitCode {

	CREDIT("Credit"), DEBIT("Debit");

	private final String value;

	private OBCreditDebitCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBCreditDebitCode fromName(String text) {
		for (OBCreditDebitCode b : OBCreditDebitCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
