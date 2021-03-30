package net.tarabutgateway.bobf.connector.sdk.api.model.standingorders;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAccount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAgent;
import net.tarabutgateway.bobf.connector.sdk.api.model.transactions.SupplementaryData;

@Data
@Builder

public class StandingOrder {

	private String accountId;
	private String standingOrderId;
	private String frequency;
	private String reference;
	private Date firstPaymentDateTime;
	private Date nextPaymentDateTime;
	private Date lastPaymentDateTime;
	private Date finalPaymentDateTime;
	private String numberOfPayments;
	private OBStandingOrderStatusCode standingOrderStatusCode;
	private Amount firstPaymentAmount;
	private Amount nextPaymentAmount;
	private Amount lastPaymentAmount;
	private Amount finalPaymentAmount;
	private CreditorDebtorAgent creditorAgent;
	private CreditorDebtorAccount creditorAccount;
	private SupplementaryData supplementaryData;

}
