package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class AdditionalPropPsuIdentifier {

	@JsonProperty("consented_accounts")
	private List<ConsentedAccount> consentedAccounts;
	private String email;
}