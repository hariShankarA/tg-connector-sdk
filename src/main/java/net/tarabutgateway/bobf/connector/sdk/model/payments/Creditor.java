package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Creditor {

	@JsonProperty("PostalAddress")
	private PostalAddressIntl postalAddress;
	@JsonProperty("BIC")
	private String bic;
	@JsonProperty("PurposeCode")
	private String purposeCode;
	@JsonProperty("Name")
	private String name;
}