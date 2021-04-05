package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Request {

	@JsonProperty("Data")
	private PaymentsRequestData data;
	@JsonProperty("Risk")
	private Risk risk;
}