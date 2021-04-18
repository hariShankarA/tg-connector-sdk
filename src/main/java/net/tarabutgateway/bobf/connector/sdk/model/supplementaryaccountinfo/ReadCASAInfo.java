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
public class ReadCASAInfo {

	@JsonProperty("LienAmount")
	private String lienAmount;

	@JsonProperty("Rate")
	private String rate;

	@JsonProperty("JointHolderName")
	private String jointHolderName;

}