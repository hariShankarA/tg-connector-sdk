package tg.connector.sdk.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tg.connector.sdk.api.dto.accounts.AccountResponse;
import tg.connector.sdk.api.dto.accounts.AccountsResponse;
import tg.connector.sdk.api.dto.balances.BalancesResponse;
import tg.connector.sdk.api.dto.beneficiaries.BeneficiariesResponse;
import tg.connector.sdk.api.dto.directDebit.DirectDebitsResponse;
import tg.connector.sdk.api.dto.offers.OffersResponse;
import tg.connector.sdk.api.dto.scheduledPayments.ScheduledPaymentsResponse;
import tg.connector.sdk.api.dto.standingOrders.StandingOrdersResponse;
import tg.connector.sdk.api.dto.transactions.TransactionsResponse;
import tg.connector.sdk.api.model.balances.OBBalanceTypeCode;
import tg.connector.sdk.api.model.common.OBCreditDebitCode;
import tg.connector.sdk.api.model.common.PsuIdentifiers;
import tg.connector.sdk.api.model.transactions.OBTransactionStatus;
import tg.connector.sdk.api.service.AccountService;
import tg.connector.sdk.api.service.BalanceService;
import tg.connector.sdk.api.service.BeneficiaryService;
import tg.connector.sdk.api.service.DirectDebitService;
import tg.connector.sdk.api.service.OfferService;
import tg.connector.sdk.api.service.ScheduledPaymentService;
import tg.connector.sdk.api.service.StandingOrderService;
import tg.connector.sdk.api.service.TransactionService;

@RestController
public class TGConnectorResource {

	@Autowired
	AccountService accountService;

	@Autowired
	BalanceService balanceService;

	@Autowired
	TransactionService transactionService;

	@Autowired
	BeneficiaryService beneficiaryService;

	@Autowired
	DirectDebitService directDebitService;

	@Autowired
	OfferService offerService;

	@Autowired
	ScheduledPaymentService scheduledPaymentService;

	@Autowired
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