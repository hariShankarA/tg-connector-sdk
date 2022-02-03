package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusDetail {

	@JsonProperty("localInstrament")
	private String localInstrament;
	@JsonProperty("status")
	private String status;
	@JsonProperty("statusReason")
	private String statusReason;
	@JsonProperty("statusReasonDescription")
	private String statusReasonDescription;

}