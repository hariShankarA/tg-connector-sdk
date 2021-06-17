package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccount;
import net.tarabutgateway.bobf.connector.sdk.model.paymentcharges.PaymentChargesResponse;

public class SupplementaryInformation {

	@JsonProperty("debtorAccount")
	private CreditorDebtorAccount debtorAccount;
	@JsonProperty("paymentCharges")
	private PaymentChargesResponse paymentCharges;

}