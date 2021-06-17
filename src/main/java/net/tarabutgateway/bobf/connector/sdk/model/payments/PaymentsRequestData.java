package net.tarabutgateway.bobf.connector.sdk.model.payments;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentsRequestData {

	@JsonProperty("ConsentId")
	private String consentId;
	
	@Valid
	@JsonProperty("Initiation")
	private Initiation initiation;
}