package net.tarabutgateway.bobf.connector.sdk.model.directdebits;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.Amount;

@Data
@Builder
public class DirectDebit {

	private String accountId;
	private String directDebitId;
	private String mandateIdentification;
	private String name;
	private OBDirectDebitStatusCode directDebitStatusCode;
	private Date previousPaymentDateTime;
	private Amount previousPaymentAmount;
	private OBDirectDebitFrequency frequency;

}
