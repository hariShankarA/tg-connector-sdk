package net.tarabutgateway.bobf.connector.sdk.model.customers;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {

	private String email;
	private String phone;
	private String mobile;
	private List<Address> address;

}