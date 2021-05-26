package net.tarabutgateway.bobf.connector.sdk.model.customers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponseData {

	private String id;
	private String number;
	private String customerName;
	private String customerType;
	private Contact contact;

}