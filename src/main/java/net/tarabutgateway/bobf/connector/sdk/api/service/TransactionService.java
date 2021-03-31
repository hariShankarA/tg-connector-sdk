package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.transactions.TransactionsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.OBCreditDebitCode;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.api.model.transactions.OBTransactionStatus;

@Service
public interface TransactionService {

	TransactionsResponse findTransactions(DeferredResult<TransactionsResponse> defResult, PsuIdentifiers psuIdentifier, List<String> accountIds, Integer page,
			OBTransactionStatus status, OBCreditDebitCode creditDebitIndicator, Date fromBookingDateTime,
			Date toBookingDateTime);

	TransactionsResponse findTransactionsByAccountId(DeferredResult<TransactionsResponse> defResult, PsuIdentifiers psuIdentifier, String accountId, Integer page,
			OBTransactionStatus status, OBCreditDebitCode creditDebitIndicator, Date fromBookingDateTime,
			Date toBookingDateTime);
}