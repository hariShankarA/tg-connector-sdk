package net.tarabutgateway.bobf.connector.sdk.api.model.supplementaryaccountinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadDepositInfo {

	@JsonProperty("Rate")
	private String rate;

	@JsonProperty("InitialDepositAmount")
	private String initialDepositAmount;

	@JsonProperty("DepositFrequency")
	private String depositFrequency;

	@JsonProperty("MaturityAmount")
	private String maturityAmount;

	@JsonProperty("MaturityDate")
	private String maturityDate;

	@JsonProperty("JointHolderName")
	private String jointHolderName;

}