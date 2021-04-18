package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReadEWalletInfo {

	@JsonProperty("Charge")
	private String charge;

	@JsonProperty("ChargeFrequency")
	private String chargeFrequency;

}
