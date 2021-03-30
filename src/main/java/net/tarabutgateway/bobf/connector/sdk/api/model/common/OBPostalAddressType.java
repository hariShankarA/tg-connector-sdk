package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBPostalAddressType {

	BUSINESS("Business"), CORRESPONDENCE("Correspondence"), DELIVERY_TO("DeliveryTo"), MAIL_TO("MailTo"),
	PO_BOX("POBox"), POSTAL("Postal"), RESIDENTIAL("Residential"), STATEMENT("Statement");

	private final String value;

	private OBPostalAddressType(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBPostalAddressType fromName(String text) {
		for (OBPostalAddressType b : OBPostalAddressType.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
