package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccountScheme;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefundAccount {

	@JsonProperty("schemeName")
	private CreditorDebtorAccountScheme schemeName;
	@JsonProperty("identification")
	private String identification;
	@JsonProperty("name")
	private String name;
	@JsonProperty("secondaryIdentification")
	private String secondaryIdentification;
}