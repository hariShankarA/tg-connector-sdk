package tg.connector.sdk.api.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountIdentificationCode {

	IBAN("BH.OBF.IBAN"), PAN("BH.OBF.PAN");

	private final String value;

	private OBExternalAccountIdentificationCode(String value) {
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

	public static OBExternalAccountIdentificationCode fromValue(String text) {
		for (OBExternalAccountIdentificationCode b : OBExternalAccountIdentificationCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
