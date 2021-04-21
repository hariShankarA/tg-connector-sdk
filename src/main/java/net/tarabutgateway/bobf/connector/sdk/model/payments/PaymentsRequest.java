package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Builder
public class PaymentsRequest {

	@JsonProperty("requestUrl")
	private String requestUrl;
	@JsonProperty("paymentType")
	private OBPaymentType paymentType;
	@JsonProperty("request")
	private Request request;
	@JsonProperty("requestHeaders")
	private RequestHeaders requestHeaders;
	@JsonProperty("tpp")
	private Tpp tpp;
}