package net.tarabutgateway.bobf.connector.sdk.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBTransactionMutability {

	MUTABLE("Mutable"), IMMUTABLE("Immutable");

	private final String value;

	private OBTransactionMutability(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBTransactionMutability fromName(String text) {
		for (OBTransactionMutability b : OBTransactionMutability.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
