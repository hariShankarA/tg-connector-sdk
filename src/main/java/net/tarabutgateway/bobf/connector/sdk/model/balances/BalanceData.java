package net.tarabutgateway.bobf.connector.sdk.model.balances;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.model.common.OBCreditDebitCode;

@Data
@Builder
public class BalanceData {

	private String accountId;
	private OBCreditDebitCode creditDebitIndicator;
	private OBBalanceTypeCode balanceType;
	private Date timestamp;
	private Amount amount;
	private List<CreditLine> creditLines;

}
