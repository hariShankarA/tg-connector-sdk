package net.tarabutgateway.bobf.connector.sdk.api.model.transactions;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAccount;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAgent;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.OBCreditDebitCode;

@Data
@Builder
public class TransactionData {

	private String accountId;
	private String transactionId;
	private String transactionReference;
	private List<String> statementReference;
	private OBCreditDebitCode creditDebitIndicator;
	private OBTransactionStatus status;
	private OBTransactionMutability transactionMutability;
	private Date bookingDateTime;
	private Date valueDateTime;
	private String transactionInformation;
	private String merchantAddress;
	private Amount amount;
	private Amount chargeAmount;
	private CurrencyExchange currencyExchange;
	private BankTransactionCode bankTransactionCode;
	private String proprietoryBankTransactionCode;
	private Balance balance;
	private MerchantDetails merchantDetails;
	private CreditorDebtorAgent creditorAgent;
	private CreditorDebtorAccount creditorAccount;
	private CreditorDebtorAgent debtorAgent;
	private CreditorDebtorAccount debtorAccount;
	private CardInstrument cardInstrument;
	private SupplementaryData supplementaryData;

}