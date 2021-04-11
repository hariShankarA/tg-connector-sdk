package net.tarabutgateway.bobf.connector.sdk.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBTransactionStatus {

	BOOKED("Booked"), PENDING("Pending");

	private final String value;

	private OBTransactionStatus(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBTransactionStatus fromName(String text) {
		for (OBTransactionStatus b : OBTransactionStatus.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
