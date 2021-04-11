package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadLoanMortgageInfo {
	
	@JsonProperty("Rate")
	private String rate;
	
	@JsonProperty("LoanAmount")
	private String loanAmount;
	
	@JsonProperty("DisbursedAmount")
	private String disbursedAmount;
	
	@JsonProperty("OutstandingLoanAmount")
	private String outstandingLoanAmount;
	
	@JsonProperty("Numberofinstallments")
	private String numberofinstallments;
	
	@JsonProperty("LoanFrequency")
	private String loanFrequency;
	
	@JsonProperty("JointHolderName")
	private String jointHolderName;

}