package net.tarabutgateway.bobf.connector.sdk.api.model.accounts;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BusinessCustomer {
	private String id;
	private String customerName;
}