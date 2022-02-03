package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBPaymentDetailsStatusCode {

	ACCEPTED("Accepted"), ACCEPTED_CANCELLATION_REQUEST("AcceptedCancellationRequest"),
	ACCEPTED_CREDIT_SETTLEMENT_COMPLETED("AcceptedCreditSettlementCompleted"),
	ACCEPTED_CUSTOMER_PROFILE("AcceptedCustomerProfile"), ACCEPTED_FUNDS_CHECKED("AcceptedFundsChecked"),
	ACCEPTED_SETTLEMENT_COMPLETED("AcceptedSettlementCompleted"),
	ACCEPTED_SETTLEMENT_IN_PROCESS("AcceptedSettlementInProcess"),
	ACCEPTED_TECHNICAL_VALIDATION("AcceptedTechnicalValidation"), ACCEPTED_WITH_CHANGE("AcceptedWithChange"),
	ACCEPTED_WITHOUT_POSTING("AcceptedWithoutPosting"), CANCELLED("Cancelled"),
	NO_CANCELLATION_PROCESS("NoCancellationProcess"),
	PARTIALLY_ACCEPTED_CANCELLATION_REQUEST("PartiallyAcceptedCancellationRequest"),
	PARTIALLY_ACCEPTED_TECHNICAL_CORRECT("PartiallyAcceptedTechnicalCorrect"), PAYMENT_CANCELLED("PaymentCancelled"),
	PENDING("Pending"), PENDING_CANCELLATION_REQUEST("PendingCancellationRequest"), RECEIVED("Received"),
	REJECTED("Rejected"), REJECTED_CANCELLATION_REQUEST("RejectedCancellationRequest");

	private final String value;

	private OBPaymentDetailsStatusCode(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return value;
	}

	public static OBPaymentDetailsStatusCode fromName(String text) {
		for (OBPaymentDetailsStatusCode b : OBPaymentDetailsStatusCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}

}