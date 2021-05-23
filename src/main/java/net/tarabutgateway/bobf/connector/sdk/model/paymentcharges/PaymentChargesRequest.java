
package net.tarabutgateway.bobf.connector.sdk.model.paymentcharges;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.payments.OBLocalInstrumentCode;
import net.tarabutgateway.bobf.connector.sdk.model.payments.OBPaymentType;

@Builder
@Data
public class PaymentChargesRequest {

	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("sourceCurrency")
	private String sourceCurrency;
	@JsonProperty("destinationCurrency")
	private String destinationCurrency;
	@JsonProperty("sourceAccount")
	private String sourceAccount;
	@JsonProperty("LocalInstrument")
	private OBLocalInstrumentCode localInstrument;
	@JsonProperty("paymentType")
	private OBPaymentType paymentType;
}