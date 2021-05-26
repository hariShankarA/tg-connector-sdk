package net.tarabutgateway.bobf.connector.sdk.model.customers;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class CustomersResponse {

	private List<CustomerResponseData> data;
	private MetaObject meta;

}