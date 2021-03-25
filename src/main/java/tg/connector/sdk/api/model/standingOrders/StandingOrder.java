package tg.connector.sdk.api.model.standingOrders;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;
import tg.connector.sdk.api.model.common.CreditorDebtorAccount;
import tg.connector.sdk.api.model.common.CreditorDebtorAgent;
import tg.connector.sdk.api.model.transactions.SupplementaryData;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StandingOrder {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("standingOrderId")
	private String standingOrderId;
	@JsonProperty("frequency")
	private String frequency;
	@JsonProperty("reference")
	private String reference;
	@JsonProperty("firstPaymentDateTime")
	private Date firstPaymentDateTime;
	@JsonProperty("nextPaymentDateTime")
	private Date nextPaymentDateTime;
	@JsonProperty("lastPaymentDateTime")
	private Date lastPaymentDateTime;
	@JsonProperty("finalPaymentDateTime")
	private Date finalPaymentDateTime;
	@JsonProperty("numberOfPayments")
	private String numberOfPayments;
	@JsonProperty("standingOrderStatusCode")
	private OBStandingOrderStatusCode standingOrderStatusCode;
	@JsonProperty("firstPaymentAmount")
	private Amount firstPaymentAmount;
	@JsonProperty("nextPaymentAmount")
	private Amount nextPaymentAmount;
	@JsonProperty("lastPaymentAmount")
	private Amount lastPaymentAmount;
	@JsonProperty("finalPaymentAmount")
	private Amount finalPaymentAmount;
	@JsonProperty("creditorAgent")
	private CreditorDebtorAgent creditorAgent;
	@JsonProperty("creditorAccount")
	private CreditorDebtorAccount creditorAccount;
	@JsonProperty("supplementaryData")
	private SupplementaryData supplementaryData;

}
