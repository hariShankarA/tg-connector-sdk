package net.tarabutgateway.bobf.connector.sdk.model.payments;

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
}