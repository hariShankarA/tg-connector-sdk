package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountIdentificationCode {

	IBAN("BH.OBF.IBAN"), PAN("BH.OBF.PAN");

	private final String value;

	private OBExternalAccountIdentificationCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBExternalAccountIdentificationCode fromName(String text) {
		for (OBExternalAccountIdentificationCode b : OBExternalAccountIdentificationCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
