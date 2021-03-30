package net.tarabutgateway.bobf.connector.sdk.api.model.transactions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MerchantDetails {

	private String merchantName;
	private String merchantCategoryCode;
}