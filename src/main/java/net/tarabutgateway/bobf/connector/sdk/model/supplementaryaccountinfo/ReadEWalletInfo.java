package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadEWalletInfo {

	@JsonProperty("Charge")
	private String charge;

	@JsonProperty("ChargeFrequency")
	private String chargeFrequency;

}
