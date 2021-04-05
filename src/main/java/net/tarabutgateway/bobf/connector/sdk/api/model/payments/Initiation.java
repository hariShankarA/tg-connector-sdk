package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAccount;

@Data
@Builder
public class Initiation {

	@JsonProperty("LocalInstrument")
	private String localInstrument;
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
}