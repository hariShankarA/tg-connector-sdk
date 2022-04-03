package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditorDebtorAgent {

	@JsonProperty("SchemeName")
	private String schemeName;
	@JsonProperty("Identification")
	private String identification;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("PostalAddress")
	private PostalAddress postalAddress;
}