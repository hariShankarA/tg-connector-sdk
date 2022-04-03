package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccount;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAgent;

@Data
@Builder
public class Initiation {
	
	@JsonProperty("CurrencyOfTransfer")
	private String currencyOfTransfer;

	@JsonProperty("LocalInstrument")
	private OBLocalInstrumentCode localInstrument;
	
	@JsonProperty("InstructionIdentification")
	private String instructionIdentification;
	
	@JsonProperty("EndToEndIdentification")
	private String endToEndIdentification;
	
	@JsonProperty("InstructedAmount")
	private Amount instructedAmount;
	
	@JsonProperty("CreditorAccount")
	private CreditorDebtorAccount creditorAccount;
	
	@JsonProperty("DebtorAccount")
	private CreditorDebtorAccount debtorAccount;
	
	@JsonProperty("RemittanceInformation")
	private RemittanceInformation remittanceInformation;
	
	@JsonProperty("ChargeBearer")
	private String ChargeBearer;
	
	@JsonProperty("RequestedExecutionDateTime")
	private Date requestedExecutionDateTime;
	
	@JsonProperty("ExchangeRateInformation")
	private ExchangeRateInformation exchangeRateInformation;
	
	@JsonProperty("Frequency")
	private String frequency;
	
	@JsonProperty("FirstPaymentDateTime")
	private Date firstPaymentDateTime;
	
	@JsonProperty("FinalPaymentDateTime")
	private Date finalPaymentDateTime;
	
	@JsonProperty("FirstPaymentAmount")
	private Amount firstPaymentAmount;
	
	@JsonProperty("Purpose")
	private String purpose;
	
	@JsonProperty("CreditorAgent")
	private CreditorDebtorAgent creditorAgent;
	

}
