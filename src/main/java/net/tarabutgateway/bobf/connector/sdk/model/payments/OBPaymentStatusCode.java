package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBPaymentStatusCode {

	PENDING("Pending"), REJECTED("Rejected"), ACCEPTED_SETTLEMENT_IN_PROCESS("AcceptedSettlementInProcess"),
	ACCEPTED_SETTLEMENT_COMPLETED("AcceptedSettlementCompleted"), ACCEPTED_WITHOUT_POSTING("AcceptedWithoutPosting"),
	ACCEPTED_CREDIT_SETTLEMENT_COMPLETED("AcceptedCreditSettlementCompleted");

	private final String value;

	private OBPaymentStatusCode(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return value;
	}

	public static OBPaymentStatusCode fromName(String text) {
		for (OBPaymentStatusCode b : OBPaymentStatusCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}

}