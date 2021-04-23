package net.tarabutgateway.bobf.connector.sdk.model.scheduledpayments;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccount;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAgent;

@Data
@Builder

public class ScheduledPayment {

	private String accountId;
	private String scheduledPaymentId;
	private Date scheduledPaymentDateTime;
	private String scheduledType;
	private String reference;
	private String debtorReference;
	private Amount instructedAmount;
	private CreditorDebtorAgent creditorAgent;
	private CreditorDebtorAccount creditorAccount;

}
