package net.tarabutgateway.bobf.connector.sdk.api.model.transactions;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.balances.OBBalanceTypeCode;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.OBCreditDebitCode;

@Data
@Builder
public class Balance {

	private Amount amount;
	private OBCreditDebitCode creditDebitIndicator;
	private OBBalanceTypeCode balanceType;
}