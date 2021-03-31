package net.tarabutgateway.bobf.connector.sdk.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.accounts.AccountResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.accounts.AccountsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.balances.BalancesResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.beneficiaries.BeneficiariesResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.directdebits.DirectDebitsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.offers.OffersResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.scheduledpayments.ScheduledPaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.standingorders.StandingOrdersResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.transactions.TransactionsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.balances.OBBalanceTypeCode;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.OBCreditDebitCode;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.api.model.transactions.OBTransactionStatus;
import net.tarabutgateway.bobf.connector.sdk.api.service.AccountService;
import net.tarabutgateway.bobf.connector.sdk.api.service.BalanceService;
import net.tarabutgateway.bobf.connector.sdk.api.service.BeneficiaryService;
import net.tarabutgateway.bobf.connector.sdk.api.service.DirectDebitService;
import net.tarabutgateway.bobf.connector.sdk.api.service.OfferService;
import net.tarabutgateway.bobf.connector.sdk.api.service.ScheduledPaymentService;
import net.tarabutgateway.bobf.connector.sdk.api.service.StandingOrderService;
import net.tarabutgateway.bobf.connector.sdk.api.service.TransactionService;

@RestController
public class TGConnectorResource {

	@Autowired(required = false)
	AccountService accountService;

	@Autowired(required = false)
	BalanceService balanceService;

	@Autowired(required = false)
	TransactionService transactionService;

	@Autowired(required = false)
	BeneficiaryService beneficiaryService;

	@Autowired(required = false)
	DirectDebitService directDebitService;

	@Autowired(required = false)
	OfferService offerService;

	@Autowired(required = false)
	ScheduledPaymentService scheduledPaymentService;

	@Autowired(required = false)
	StandingOrderService standingOrderService;

	@GetMapping("/accounts")
	public DeferredResult<AccountsResponse> getAccounts(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<AccountsResponse> defResult = new DeferredResult<>(3000L);
		accountService.findAccounts(defResult, psuIdentifier, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}")
	public DeferredResult<AccountResponse> getAccount(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<AccountResponse> defResult = new DeferredResult<>(3000L);
		accountService.findByAccountId(defResult, psuIdentifier, accountId);
		return defResult;
	}

	@GetMapping("/balances")
	public DeferredResult<BalancesResponse> getBalances(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds,
			@RequestParam(required = false, name = "balanceType", defaultValue = "") OBBalanceTypeCode balanceType) {
		DeferredResult<BalancesResponse> defResult = new DeferredResult<>(3000L);
		balanceService.findBalancesByAccountIds(defResult, psuIdentifier, accountIds, balanceType);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/balances")
	public DeferredResult<BalancesResponse> getBalance(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId,
			@RequestParam(required = false, name = "balanceType", defaultValue = "") OBBalanceTypeCode balanceType) {
		DeferredResult<BalancesResponse> defResult = new DeferredResult<>(3000L);
		balanceService.findBalancesByAccountId(defResult, psuIdentifier, accountId, balanceType);
		return defResult;
	}

	@GetMapping("/transactions")
	public DeferredResult<TransactionsResponse> getTransactions(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds,
			@RequestParam(required = false, name = "page", defaultValue = "1") Integer page,
			@RequestParam(required = false, name = "status", defaultValue = "") OBTransactionStatus status,
			@RequestParam(required = false, name = "creditDebitIndicator", defaultValue = "") OBCreditDebitCode creditDebitIndicator,
			@RequestParam(required = false, name = "fromBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fromBookingDateTime,
			@RequestParam(required = false, name = "toBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date toBookingDateTime) {
		DeferredResult<TransactionsResponse> defResult = new DeferredResult<>(3000L);
		transactionService.findTransactions(defResult, psuIdentifier, accountIds, page, status, creditDebitIndicator,
				fromBookingDateTime, toBookingDateTime);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/transactions")
	public DeferredResult<TransactionsResponse> getTransaction(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId,
			@RequestParam(required = false, name = "page", defaultValue = "1") Integer page,
			@RequestParam(required = false, name = "status", defaultValue = "") OBTransactionStatus status,
			@RequestParam(required = false, name = "creditDebitIndicator", defaultValue = "") OBCreditDebitCode creditDebitIndicator,
			@RequestParam(required = false, name = "fromBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fromBookingDateTime,
			@RequestParam(required = false, name = "toBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date toBookingDateTime) {
		DeferredResult<TransactionsResponse> defResult = new DeferredResult<>(3000L);
		transactionService.findTransactionsByAccountId(defResult, psuIdentifier, accountId, page, status,
				creditDebitIndicator, fromBookingDateTime, toBookingDateTime);
		return defResult;
	}

	@GetMapping("/beneficiaries")
	public DeferredResult<BeneficiariesResponse> getBeneficiaries(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<BeneficiariesResponse> defResult = new DeferredResult<>(3000L);
		beneficiaryService.findBeneficiaries(defResult, psuIdentifier, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/beneficiaries")
	public DeferredResult<BeneficiariesResponse> getBeneficiary(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<BeneficiariesResponse> defResult = new DeferredResult<>(3000L);
		beneficiaryService.findBeneficiariesAccountId(defResult, psuIdentifier, accountId);
		return defResult;
	}

	@GetMapping("/direct-debits")
	public DeferredResult<DirectDebitsResponse> getDirectDebits(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<DirectDebitsResponse> defResult = new DeferredResult<>(3000L);
		directDebitService.findDirectDebits(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/direct-debits")
	public DeferredResult<DirectDebitsResponse> getDirectDebit(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<DirectDebitsResponse> defResult = new DeferredResult<>(3000L);
		directDebitService.findDirectDebitByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/offers")
	public DeferredResult<OffersResponse> getOffers(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<OffersResponse> defResult = new DeferredResult<>(3000L);
		offerService.findOffers(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/offers")
	public DeferredResult<OffersResponse> getOffer(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<OffersResponse> defResult = new DeferredResult<>(3000L);
		offerService.findOffersByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/scheduled-payments")
	public DeferredResult<ScheduledPaymentsResponse> getFuturDatedPayment(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<ScheduledPaymentsResponse> defResult = new DeferredResult<>(3000L);
		scheduledPaymentService.findScheduledPayments(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/scheduled-payments")
	public DeferredResult<ScheduledPaymentsResponse> getFuturDatedPayments(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<ScheduledPaymentsResponse> defResult = new DeferredResult<>(3000L);
		scheduledPaymentService.findScheduledPaymentByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/standing-orders")
	public DeferredResult<StandingOrdersResponse> getStandingOrders(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<StandingOrdersResponse> defResult = new DeferredResult<>(3000L);
		standingOrderService.findStandingOrders(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/standing-orders")
	public DeferredResult<StandingOrdersResponse> getStandingOrder(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<StandingOrdersResponse> defResult = new DeferredResult<>(3000L);
		standingOrderService.findStandingOrderByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

}