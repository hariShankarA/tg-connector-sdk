package net.tarabutgateway.bobf.connector.sdk.api.model.balances;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;

@Data
@Builder
public class CreditLine {
	private boolean included;

	private Amount amount;

}