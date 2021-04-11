package net.tarabutgateway.bobf.connector.sdk.model.accounts;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class AccountResponse {

	private AccountData data;

	private MetaObject meta;

}