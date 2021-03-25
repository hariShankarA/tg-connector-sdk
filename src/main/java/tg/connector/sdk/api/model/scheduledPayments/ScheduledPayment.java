package tg.connector.sdk.api.model.scheduledPayments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;
import tg.connector.sdk.api.model.common.CreditorDebtorAccount;
import tg.connector.sdk.api.model.common.CreditorDebtorAgent;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ScheduledPayment {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("scheduledPaymentId")
	private String scheduledPaymentId;
	@JsonProperty("scheduledPaymentDateTime")
	private String scheduledPaymentDateTime;
	@JsonProperty("scheduledType")
	private String scheduledType;
	@JsonProperty("reference")
	private String reference;
	@JsonProperty("debtorReference")
	private String debtorReference;
	@JsonProperty("instructedAmount")
	private Amount instructedAmount;
	@JsonProperty("creditorAgent")
	private CreditorDebtorAgent creditorAgent;
	@JsonProperty("creditorAccount")
	private CreditorDebtorAccount creditorAccount;

}
