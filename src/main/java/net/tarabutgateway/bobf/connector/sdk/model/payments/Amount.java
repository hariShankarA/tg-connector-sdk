package net.tarabutgateway.bobf.connector.sdk.model.payments;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Amount {
	@JsonProperty("Amount")
	private String amount;
	@JsonProperty("Currency")
	private String currency;

}