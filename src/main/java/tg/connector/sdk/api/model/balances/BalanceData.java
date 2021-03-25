package tg.connector.sdk.api.model.balances;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;
import tg.connector.sdk.api.model.common.OBCreditDebitCode;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BalanceData {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("creditDebitIndicator")
	private OBCreditDebitCode creditDebitIndicator;
	@JsonProperty("balanceType")
	private OBBalanceTypeCode balanceType;
	@JsonProperty("timestamp")
	private Date timestamp;
	@JsonProperty("amount")
	private Amount amount;
	@JsonProperty("creditLines")
	private List<CreditLine> creditLines;

}
