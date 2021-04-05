package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentsResponseData {

	@JsonProperty("id")
	private String id;
	@JsonProperty("status")
	private String status;
	@JsonProperty("creationDateTime")
	private Date creationDateTime;
	@JsonProperty("statusUpdateDateTime")
	private Date statusUpdateDateTime;
}