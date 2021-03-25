package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBTransactionStatus {

	BOOKED("Booked"), PENDING("Pending");

	private final String value;

	private OBTransactionStatus(String value) {
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

	public static OBTransactionStatus fromValue(String text) {
		for (OBTransactionStatus b : OBTransactionStatus.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
