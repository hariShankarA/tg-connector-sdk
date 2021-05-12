
package net.tarabutgateway.bobf.connector.sdk.model.exchange;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExchangeRateRequest {

	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("sourceCurrency")
	private String sourceCurrency;
	@JsonProperty("destinationCurrency")
	private String destinationCurrency;
}