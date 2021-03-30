package net.tarabutgateway.bobf.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountTypeCode {

	BUSINESS("Business"), PERSONAL("Personal");

	private final String value;

	private OBExternalAccountTypeCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBExternalAccountTypeCode fromValue(String text) {
		for (OBExternalAccountTypeCode b : OBExternalAccountTypeCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
