package net.tarabutgateway.bobf.connector.sdk.model.exchange;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExchangeRateResponse {

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
	private Map<String,String> others;
}