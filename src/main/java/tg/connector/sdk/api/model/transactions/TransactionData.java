package tg.connector.sdk.api.model.transactions;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;
import tg.connector.sdk.api.model.common.CreditorDebtorAccount;
import tg.connector.sdk.api.model.common.CreditorDebtorAgent;
import tg.connector.sdk.api.model.common.OBCreditDebitCode;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionData {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("transactionId")
	private String transactionId;
	@JsonProperty("transactionReference")
	private String transactionReference;
	@JsonProperty("statementReference")
	private List<String> statementReference;
	@JsonProperty("creditDebitIndicator")
	private OBCreditDebitCode creditDebitIndicator;
	@JsonProperty("status")
	private OBTransactionStatus status;
	@JsonProperty("transactionMutability")
	private OBTransactionMutability transactionMutability;
	@JsonProperty("bookingDateTime")
	private Date bookingDateTime;
	@JsonProperty("valueDateTime")
	private Date valueDateTime;
	@JsonProperty("transactionInformation")
	private String transactionInformation;
	@JsonProperty("merchantAddress")
	private String merchantAddress;
	@JsonProperty("amount")
	private Amount amount;
	@JsonProperty("chargeAmount")
	private Amount chargeAmount;
	@JsonProperty("currencyExchange")
	private CurrencyExchange currencyExchange;
	@JsonProperty("bankTransactionCode")
	private BankTransactionCode bankTransactionCode;
	@JsonProperty("proprietoryBankTransactionCode")
	private String proprietoryBankTransactionCode;
	@JsonProperty("balance")
	private Balance balance;
	@JsonProperty("merchantDetails")
	private MerchantDetails merchantDetails;
	@JsonProperty("creditorAgent")
	private CreditorDebtorAgent creditorAgent;
	@JsonProperty("creditorAccount")
	private CreditorDebtorAccount creditorAccount;
	@JsonProperty("debtorAgent")
	private CreditorDebtorAgent debtorAgent;
	@JsonProperty("debtorAccount")
	private CreditorDebtorAccount debtorAccount;
	@JsonProperty("cardInstrument")
	private CardInstrument cardInstrument;
	@JsonProperty("supplementaryData")
	private SupplementaryData supplementaryData;

}