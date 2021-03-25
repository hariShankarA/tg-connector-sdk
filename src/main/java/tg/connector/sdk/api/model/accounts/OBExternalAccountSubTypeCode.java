package tg.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountSubTypeCode {

	CHARGE_CARD("ChargeCard"), CREDIT_CARD("CreditCard"), CURRENT_ACCOUNT("CurrentAccount"), E_WALLET("EWallet"),
	LOAN("Loan"), MORTGAGE("Mortgage"), PRE_PAID_CARD("PrePaidCard"), SAVINGS("Savings"), DEPOSIT("Deposit");

	private final String value;

	private OBExternalAccountSubTypeCode(String value) {
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

	public static OBExternalAccountSubTypeCode fromValue(String text) {
		for (OBExternalAccountSubTypeCode b : OBExternalAccountSubTypeCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;

	}
}
