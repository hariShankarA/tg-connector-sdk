package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestHeaders {

	@JsonProperty("host")
	private String host;
	@JsonProperty("self_uri")
	private String selfUri;
	@JsonProperty("x-cert-dn")
	private String xCertDn;
	@JsonProperty("x-cert-fingerprint")
	private String xCertFingerprint;
	@JsonProperty("content-type")
	private String contentType;
	@JsonProperty("x-fapi-financial-id")
	private String xFapiFinancialId;
	@JsonProperty("x-fapi-interaction-id")
	private String xFapiInteractionId;
	@JsonProperty("authorization")
	private String authorization;
}