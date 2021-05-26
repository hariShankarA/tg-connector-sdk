package net.tarabutgateway.bobf.connector.sdk.model.customers;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class CustomerResponse {

	private CustomerResponseData data;
	private MetaObject meta;

}
