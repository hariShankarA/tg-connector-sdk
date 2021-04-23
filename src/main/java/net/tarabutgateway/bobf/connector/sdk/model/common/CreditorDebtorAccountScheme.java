package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreditorDebtorAccountScheme {

	BH_BOBF_IBAN("BH.OBF.IBAN"), BH_BOBF_BBAN("BH.OBF.BBAN"), BH_BOBF_PAN("BH.OBF.PAN");

	private final String value;

	private CreditorDebtorAccountScheme(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return value;
	}

	public boolean isIBAN() {
		return value.endsWith("IBAN");
	}
	
	

}