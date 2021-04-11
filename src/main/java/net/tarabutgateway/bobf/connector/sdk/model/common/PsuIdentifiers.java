package net.tarabutgateway.bobf.connector.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PsuIdentifiers {

	@JsonProperty("userId")
	private String userId;
	
	@JsonProperty("additionalProp1")
	private AdditionalPropPsuIdentifier additionalProp1;
}