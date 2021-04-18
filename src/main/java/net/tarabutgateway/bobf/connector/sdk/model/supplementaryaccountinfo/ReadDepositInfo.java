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