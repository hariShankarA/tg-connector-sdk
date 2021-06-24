package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentStatusResponseData {

	@JsonProperty("id")
	private String id;
	@JsonProperty("status")
	private OBPaymentStatusCode status;
	@JsonProperty("creationDateTime")
	private Date creationDateTime;
	@JsonProperty("statusUpdateDateTime")
	private Date statusUpdateDateTime;

}