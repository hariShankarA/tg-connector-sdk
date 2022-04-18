package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreditorDebtorAccountScheme {

	UK_OBIE_SORTCODEACCOUNTNUMBER("UK.OBIE.SortCodeAccountNumber"), UK_OBIE_IBAN("UK.OBIE.IBAN"), UK_OBIE_PAN("UK.OBIE.PAN");

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