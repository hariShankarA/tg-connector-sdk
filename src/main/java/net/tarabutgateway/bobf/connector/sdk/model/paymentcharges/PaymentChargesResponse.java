package net.tarabutgateway.bobf.connector.sdk.model.paymentcharges;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentChargesResponse {

	@JsonProperty("fromCurrency")
	private String fromCurrency;
	@JsonProperty("fromAmount")
	private Double fromAmount;
	@JsonProperty("fromExchangeRate")
	private Double fromExchangeRate;
	@JsonProperty("toCurrency")
	private String toCurrency;
	@JsonProperty("toAmount")
	private Double toAmount;
	@JsonProperty("toExchangeRate")
	private Double toExchangeRate;
	@JsonProperty("forexId")
	private String forexId;
	@JsonProperty("others")
	private Map<String, String> others;

	@JsonProperty("chargeAmountInAccountCurrency")
	private Double chargeAmountInAccountCurrency;
	@JsonProperty("chargeAmount")
	private Double chargeAmount;
	@JsonProperty("chargeCurrency")
	private String chargeCurrency;

	@JsonProperty("vatAmount")
	private Double vatAmount;
	@JsonProperty("vatAmountInAccountCurrency")
	private Double vatAmountInAccountCurrency;
	@JsonProperty("vatCurrency")
	private String vatCurrency;

}