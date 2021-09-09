package net.tarabutgateway.bobf.connector.sdk.model.beneficiaries;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccountScheme;

@Data
@Builder
public class CreditorAccount {

	private CreditorDebtorAccountScheme schemeName;
	private String identification;
	private String secondaryIdentification;
	private String name;

}