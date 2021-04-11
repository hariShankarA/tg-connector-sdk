package net.tarabutgateway.bobf.connector.sdk.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditorDebtorAgent {

	private String schemeName;
	private String identification;
	private String name;
	private PostalAddress postalAddress;
}