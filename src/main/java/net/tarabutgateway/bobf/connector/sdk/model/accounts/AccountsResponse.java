package net.tarabutgateway.bobf.connector.sdk.model.accounts;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class AccountsResponse {

	private List<AccountData> data;

	private MetaObject meta;

}