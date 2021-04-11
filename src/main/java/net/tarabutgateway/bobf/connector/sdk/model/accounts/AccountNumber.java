package net.tarabutgateway.bobf.connector.sdk.model.accounts;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountNumber {
	private String name;
	private String schemeName;
	private String identification;
	private String secondaryIdentification;
}