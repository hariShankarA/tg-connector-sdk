package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PaymentsRequestData {

	@JsonProperty("Initiation")
	private Initiation initiation;
}