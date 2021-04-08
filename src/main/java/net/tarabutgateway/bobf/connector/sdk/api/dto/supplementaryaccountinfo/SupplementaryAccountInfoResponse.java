package net.tarabutgateway.bobf.connector.sdk.api.dto.supplementaryaccountinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.supplementaryaccountinfo.ReadAccount;

@Data
@Builder
public class SupplementaryAccountInfoResponse {

	@JsonProperty("data")
	private ReadAccount data;

}