package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.Map;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Request {

	@Valid
	@JsonProperty("Data")
	private PaymentsRequestData data;

	@JsonProperty("Risk")
	private Risk risk;

	@JsonProperty("additionalProp1")
	private Map<String, String> additionalProp1;
}