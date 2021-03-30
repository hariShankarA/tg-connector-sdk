package net.tarabutgateway.bobf.connector.sdk.api.dto.balances;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.balances.BalanceData;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;

@Data
@Builder
public class BalancesResponse {

	private List<BalanceData> data;

	private MetaObject meta;
}
