package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBTransactionMutability {

	MUTABLE("Mutable"), IMMUTABLE("Immutable");

	private final String value;

	private OBTransactionMutability(String value) {
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

	public static OBTransactionMutability fromValue(String text) {
		for (OBTransactionMutability b : OBTransactionMutability.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
