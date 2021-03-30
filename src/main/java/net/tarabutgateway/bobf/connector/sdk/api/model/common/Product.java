package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
	private String id;
	private String productName;
}