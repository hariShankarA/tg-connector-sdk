package net.tarabutgateway.bobf.connector.sdk.api.model.supplementaryaccountinfo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadAccount {

	@JsonProperty("AccountID")
	private String accountId;

	@JsonProperty("AccountOpeningDate")
	private Date accountOpeningDate;

	@JsonProperty("ReadCASAInfo")
	private ReadCASAInfo readCASAInfo;

	@JsonProperty("ReadDepositInfo")
	private ReadDepositInfo readDepositInfo;

	@JsonProperty("ReadLoanMortgageInfo")
	private ReadLoanMortgageInfo readLoanMortgageInfo;

	@JsonProperty("ReadCreditCardInfo")
	private ReadCreditCardInfo readCreditCardInfo;

	@JsonProperty("ReadEWalletInfo")
	private ReadEWalletInfo readEWalletInfo;

}