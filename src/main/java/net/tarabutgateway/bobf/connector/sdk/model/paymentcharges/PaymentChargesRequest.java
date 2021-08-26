
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
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("sourceAccountCurrency")
	private String sourceAccountCurrency;
	@JsonProperty("sourceAccount")
	private String sourceAccount;
	@JsonProperty("destinationAccount")
	private String destinationAccount;
	@JsonProperty("localInstrument")
	private OBLocalInstrumentCode localInstrument;
	@JsonProperty("paymentType")
	private OBPaymentType paymentType;
	@JsonProperty("currencyOfTransfer")
	private String currencyOfTransfer;

}