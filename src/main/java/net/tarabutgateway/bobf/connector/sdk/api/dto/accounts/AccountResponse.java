package net.tarabutgateway.bobf.connector.sdk.api.dto.accounts;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.accounts.AccountData;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;

@Data
@Builder
public class AccountResponse {

	private AccountData data;

	private MetaObject meta;

}