package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ConsentedAccount {

	private String accountId;
	private String accountType;
}