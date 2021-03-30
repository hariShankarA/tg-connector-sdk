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
	public AccountsResponse getAccounts(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		return accountService.findAccounts(psuIdentifier, accountIds);
	}

	@GetMapping("/accounts/{accountId}")
	public AccountResponse getAccount(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId) {
		return accountService.findByAccountId(psuIdentifier, accountId);
	}

	@GetMapping("/balances")
	public BalancesResponse getBalances(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds,
			@RequestParam(required = false, name = "balanceType", defaultValue = "") OBBalanceTypeCode balanceType) {
		return balanceService.findBalancesByAccountIds(psuIdentifier, accountIds, balanceType);
	}

	@GetMapping("/accounts/{accountId}/balances")
	public BalancesResponse getBalance(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId,
			@RequestParam(required = false, name = "balanceType", defaultValue = "") OBBalanceTypeCode balanceType) {
		return balanceService.findBalancesByAccountId(psuIdentifier, accountId, balanceType);
	}

	@GetMapping("/transactions")
	public TransactionsResponse getTransactions(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds,
			@RequestParam(required = false, name = "page", defaultValue = "1") Integer page,
			@RequestParam(required = false, name = "status", defaultValue = "") OBTransactionStatus status,
			@RequestParam(required = false, name = "creditDebitIndicator", defaultValue = "") OBCreditDebitCode creditDebitIndicator,
			@RequestParam(required = false, name = "fromBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fromBookingDateTime,
			@RequestParam(required = false, name = "toBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date toBookingDateTime) {
		return transactionService.findTransactions(psuIdentifier, accountIds, page, status, creditDebitIndicator,
				fromBookingDateTime, toBookingDateTime);
	}

	@GetMapping("/accounts/{accountId}/transactions")
	public TransactionsResponse getTransaction(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId,
			@RequestParam(required = false, name = "page", defaultValue = "1") Integer page,
			@RequestParam(required = false, name = "status", defaultValue = "") OBTransactionStatus status,
			@RequestParam(required = false, name = "creditDebitIndicator", defaultValue = "") OBCreditDebitCode creditDebitIndicator,
			@RequestParam(required = false, name = "fromBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fromBookingDateTime,
			@RequestParam(required = false, name = "toBookingDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date toBookingDateTime) {
		return transactionService.findTransactionsByAccountId(psuIdentifier, accountId, page, status,
				creditDebitIndicator, fromBookingDateTime, toBookingDateTime);
	}

	@GetMapping("/beneficiaries")
	public BeneficiariesResponse getBeneficiaries(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		return beneficiaryService.findBeneficiaries(psuIdentifier, accountIds);
	}

	@GetMapping("/accounts/{accountId}/beneficiaries")
	public BeneficiariesResponse getBeneficiary(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId) {
		return beneficiaryService.findBeneficiariesAccountId(psuIdentifier, accountId);
	}

	@GetMapping("/direct-debits")
	public DirectDebitsResponse getDirectDebits(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		return directDebitService.findDirectDebits(psuIdentifierObj, accountIds);
	}

	@GetMapping("/accounts/{accountId}/direct-debits")
	public DirectDebitsResponse getDirectDebit(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		return directDebitService.findDirectDebitByAccountId(psuIdentifierObj, accountId);
	}

	@GetMapping("/offers")
	public OffersResponse getOffers(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		return offerService.findOffers(psuIdentifierObj, accountIds);
	}

	@GetMapping("/accounts/{accountId}/offers")
	public OffersResponse getOffer(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		return offerService.findOffersByAccountId(psuIdentifierObj, accountId);
	}

	@GetMapping("/scheduled-payments")
	public ScheduledPaymentsResponse getFuturDatedPayment(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		return scheduledPaymentService.findScheduledPayments(psuIdentifierObj, accountIds);
	}

	@GetMapping("/accounts/{accountId}/scheduled-payments")
	public ScheduledPaymentsResponse getFuturDatedPayments(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		return scheduledPaymentService.findScheduledPaymentByAccountId(psuIdentifierObj, accountId);
	}

	@GetMapping("/standing-orders")
	public StandingOrdersResponse getStandingOrders(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		return standingOrderService.findStandingOrders(psuIdentifierObj, accountIds);
	}

	@GetMapping("/accounts/{accountId}/standing-orders")
	public StandingOrdersResponse getStandingOrder(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		return standingOrderService.findStandingOrderByAccountId(psuIdentifierObj, accountId);
	}

}