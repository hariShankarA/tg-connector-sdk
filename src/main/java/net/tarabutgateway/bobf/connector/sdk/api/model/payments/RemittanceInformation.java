package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RemittanceInformation {

	@JsonProperty("Reference")
	private String reference;
	@JsonProperty("Unstructured")
	private String unstructured;
}