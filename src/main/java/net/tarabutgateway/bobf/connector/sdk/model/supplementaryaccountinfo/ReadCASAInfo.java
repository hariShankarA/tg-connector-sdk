package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadCASAInfo {

	@JsonProperty("LienAmount")
	private String lienAmount;

	@JsonProperty("Rate")
	private String rate;

	@JsonProperty("JointHolderName")
	private String jointHolderName;

}