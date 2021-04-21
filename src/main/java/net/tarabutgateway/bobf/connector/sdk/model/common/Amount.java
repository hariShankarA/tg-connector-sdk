package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Amount {
	@JsonProperty("amount")
	private String amount;
	@JsonProperty("currency")
	private String currency;

}