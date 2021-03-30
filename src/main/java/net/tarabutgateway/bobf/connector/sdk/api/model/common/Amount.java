package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Amount {
	private String amount;
	private String currency;

}