package net.tarabutgateway.bobf.connector.sdk.model.transactions;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.balances.OBBalanceTypeCode;
import net.tarabutgateway.bobf.connector.sdk.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.model.common.OBCreditDebitCode;

@Data
@Builder
public class Balance {

	private Amount amount;
	private OBCreditDebitCode creditDebitIndicator;
	private OBBalanceTypeCode balanceType;
}