package tg.connector.sdk.api.model.balances;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBBalanceTypeCode {

	CLOSING_AVAILABLE("ClosingAvailable"), CLOSING_BOOKED("ClosingBooked"), CLOSING_CLEARED("ClosingCleared"),
	EXPECTED("Expected"), FORWARD_AVAILABLE("ForwardAvailable"), INFORMATION("Information"),
	INTERIM_AVAILABLE("InterimAvailable"), INTERIM_BOOKED("InterimBooked"), INTERIM_CLEARED("InterimCleared"),
	OPENING_AVAILABLE("OpeningAvailable"), OPENING_BOOKED("OpeningBooked"), OPENING_CLEARED("OpeningCleared"),
	PREVIOUSLY_CLOSED_BOOKED("PreviouslyClosedBooked");

	private final String value;

	private OBBalanceTypeCode(String value) {
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

	public static OBBalanceTypeCode fromValue(String text) {
		for (OBBalanceTypeCode b : OBBalanceTypeCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
