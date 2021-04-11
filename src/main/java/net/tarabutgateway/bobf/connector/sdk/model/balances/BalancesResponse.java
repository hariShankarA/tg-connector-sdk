package net.tarabutgateway.bobf.connector.sdk.model.balances;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class BalancesResponse {

	private List<BalanceData> data;

	private MetaObject meta;
}
