package net.tarabutgateway.bobf.connector.sdk.model.balances;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.Amount;

@Data
@Builder
public class CreditLine {
	private boolean included;
	private Amount amount;
	private String creditType;

}