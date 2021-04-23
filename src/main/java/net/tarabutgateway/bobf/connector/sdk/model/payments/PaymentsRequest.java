package net.tarabutgateway.bobf.connector.sdk.model.payments;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class PaymentsRequest {

	@JsonProperty("requestUrl")
	private String requestUrl;
	
	@JsonProperty("paymentType")
	private OBPaymentType paymentType;
	
	@Valid
	@JsonProperty("request")
	private Request request;
	
	@JsonProperty("requestHeaders")
	private RequestHeaders requestHeaders;
	
	@JsonProperty("tpp")
	private Tpp tpp;
}