package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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