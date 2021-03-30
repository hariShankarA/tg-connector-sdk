package net.tarabutgateway.bobf.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountSubTypeCode {

	CHARGE_CARD("ChargeCard"), CREDIT_CARD("CreditCard"), CURRENT_ACCOUNT("CurrentAccount"), E_WALLET("EWallet"),
	LOAN("Loan"), MORTGAGE("Mortgage"), PRE_PAID_CARD("PrePaidCard"), SAVINGS("Savings"), DEPOSIT("Deposit");

	private final String value;

	private OBExternalAccountSubTypeCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBExternalAccountSubTypeCode fromName(String text) {
		for (OBExternalAccountSubTypeCode b : OBExternalAccountSubTypeCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}
}
