package net.tarabutgateway.bobf.connector.sdk.model.common;

import java.util.List;

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

public class AdditionalPropPsuIdentifier {

	@JsonProperty("consented_accounts")
	private List<ConsentedAccount> consentedAccounts;
	private String email;
}