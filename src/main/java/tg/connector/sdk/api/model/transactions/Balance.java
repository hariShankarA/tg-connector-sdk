package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.balances.OBBalanceTypeCode;
import tg.connector.sdk.api.model.common.Amount;
import tg.connector.sdk.api.model.common.OBCreditDebitCode;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Balance {

	@JsonProperty("amount")
	private Amount amount;
	@JsonProperty("creditDebitIndicator")
	private OBCreditDebitCode creditDebitIndicator;
	@JsonProperty("balanceType")
	private OBBalanceTypeCode balanceType;
}