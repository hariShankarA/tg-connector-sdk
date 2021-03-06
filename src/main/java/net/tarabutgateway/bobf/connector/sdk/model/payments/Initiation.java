package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.Date;

import javax.validation.constraints.Future;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccount;

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
	
	@Future
	@JsonProperty("RequestedExecutionDateTime")
	private Date requestedExecutionDateTime;

}