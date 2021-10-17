package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBPaymentType {

	DOMESTIC_PAYMENT("domestic-payment"), 
	FUTURE_DATED_PAYMENT("domestic-scheduled-payment"),
	STANDING_ORDER("standing-order"), 
	INTERNATIONAL_PAYMENT("international-payment"),
	INTERNATIONAL_FUTURE_DATED_PAYMENT("international-scheduled-payment"),
	INTERNATIONAL_STANDING_ORDER("international-standing-order");

	private final String value;

	private OBPaymentType(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return value;
	}

	public static OBPaymentType fromName(String text) {
		for (OBPaymentType b : OBPaymentType.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}
	
	public boolean isInternational() {
		return value.startsWith("international");
	}
	
	

}