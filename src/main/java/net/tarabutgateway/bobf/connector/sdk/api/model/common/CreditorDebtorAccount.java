package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditorDebtorAccount {

	private String schemeName;

	private String identification;

	private String secondaryIdentification;

	private String name;

}