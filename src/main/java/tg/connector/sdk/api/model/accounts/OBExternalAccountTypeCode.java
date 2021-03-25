package tg.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountTypeCode {

	BUSINESS("Business"), PERSONAL("Personal");

	private final String value;

	private OBExternalAccountTypeCode(String value) {
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

	public static OBExternalAccountTypeCode fromValue(String text) {
		for (OBExternalAccountTypeCode b : OBExternalAccountTypeCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
