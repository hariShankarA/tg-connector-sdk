package net.tarabutgateway.bobf.connector.sdk.service;

import java.util.Date;
import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.OBCreditDebitCode;
import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.transactions.OBTransactionStatus;
import net.tarabutgateway.bobf.connector.sdk.model.transactions.TransactionsResponse;

@Service
public interface TransactionService {

	@Async
	void findTransactions(DeferredResult<TransactionsResponse> defResult, PsuIdentifiers psuIdentifier, List<String> accountIds, Integer page,
			OBTransactionStatus status, OBCreditDebitCode creditDebitIndicator, Date fromBookingDateTime,
			Date toBookingDateTime);

	@Async
	void findTransactionsByAccountId(DeferredResult<TransactionsResponse> defResult, PsuIdentifiers psuIdentifier, String accountId, Integer page,
			OBTransactionStatus status, OBCreditDebitCode creditDebitIndicator, Date fromBookingDateTime,
			Date toBookingDateTime);
}