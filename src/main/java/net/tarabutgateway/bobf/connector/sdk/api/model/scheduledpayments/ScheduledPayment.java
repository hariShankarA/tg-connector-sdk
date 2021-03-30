package net.tarabutgateway.bobf.connector.sdk.api.model.scheduledpayments;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAccount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAgent;

@Data
@Builder

public class ScheduledPayment {

	private String accountId;
	private String scheduledPaymentId;
	private String scheduledPaymentDateTime;
	private String scheduledType;
	private String reference;
	private String debtorReference;
	private Amount instructedAmount;
	private CreditorDebtorAgent creditorAgent;
	private CreditorDebtorAccount creditorAccount;

}
