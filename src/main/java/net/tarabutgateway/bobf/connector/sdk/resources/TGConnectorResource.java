package net.tarabutgateway.bobf.connector.sdk.resources;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.accounts.AccountResponse;
import net.tarabutgateway.bobf.connector.sdk.model.accounts.AccountsResponse;
import net.tarabutgateway.bobf.connector.sdk.model.balances.BalancesResponse;
import net.tarabutgateway.bobf.connector.sdk.model.balances.OBBalanceTypeCode;
import net.tarabutgateway.bobf.connector.sdk.model.beneficiaries.BeneficiariesResponse;
import net.tarabutgateway.bobf.connector.sdk.model.common.OBCreditDebitCode;
import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.directdebits.DirectDebitsResponse;
import net.tarabutgateway.bobf.connector.sdk.model.offers.OffersResponse;
import net.tarabutgateway.bobf.connector.sdk.model.parties.PartiesResponse;
import net.tarabutgateway.bobf.connector.sdk.model.parties.PartyResponse;
import net.tarabutgateway.bobf.connector.sdk.model.paymentcharges.PaymentChargesRequest;
import net.tarabutgateway.bobf.connector.sdk.model.paymentcharges.PaymentChargesResponse;
import net.tarabutgateway.bobf.connector.sdk.model.payments.PaymentsRequest;
import net.tarabutgateway.bobf.connector.sdk.model.payments.PaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.model.products.ProductsResponse;
import net.tarabutgateway.bobf.connector.sdk.model.scheduledpayments.ScheduledPaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.model.standingorders.StandingOrdersResponse;
import net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo.SupplementaryAccountInfoResponse;
import net.tarabutgateway.bobf.connector.sdk.model.transactions.OBTransactionStatus;
import net.tarabutgateway.bobf.connector.sdk.model.transactions.TransactionsResponse;
import net.tarabutgateway.bobf.connector.sdk.service.AccountService;
import net.tarabutgateway.bobf.connector.sdk.service.BalanceService;
import net.tarabutgateway.bobf.connector.sdk.service.BeneficiaryService;
import net.tarabutgateway.bobf.connector.sdk.service.DirectDebitService;
import net.tarabutgateway.bobf.connector.sdk.service.OfferService;
import net.tarabutgateway.bobf.connector.sdk.service.PartyService;
import net.tarabutgateway.bobf.connector.sdk.service.PaymentChargesService;
import net.tarabutgateway.bobf.connector.sdk.service.PaymentService;
import net.tarabutgateway.bobf.connector.sdk.service.ProductService;
import net.tarabutgateway.bobf.connector.sdk.service.ScheduledPaymentService;
import net.tarabutgateway.bobf.connector.sdk.service.StandingOrderService;
import net.tarabutgateway.bobf.connector.sdk.service.SupplementaryAccountInfoService;
import net.tarabutgateway.bobf.connector.sdk.service.TransactionService;

@RestController
public class TGConnectorResource {

	private static final Long DEFAULT_DEFERRED_TIMEOUT = 20000L;

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

	@Autowired(required = false)
	PaymentService paymentService;

	@Autowired(required = false)
	SupplementaryAccountInfoService supplementaryAccountInfoService;

	@Autowired(required = false)
	ProductService productService;

	@Autowired(required = false)
	PartyService partyService;

	@Autowired(required = false)
	PaymentChargesService paymentChargesService;

	@GetMapping("/accounts")
	public DeferredResult<AccountsResponse> getAccounts(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<AccountsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		accountService.findAccounts(defResult, psuIdentifier, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}")
	public DeferredResult<AccountResponse> getAccount(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<AccountResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		accountService.findByAccountId(defResult, psuIdentifier, accountId);
		return defResult;
	}

	@GetMapping("/balances")
	public DeferredResult<BalancesResponse> getBalances(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds,
			@RequestParam(required = false, name = "balanceType", defaultValue = "") OBBalanceTypeCode balanceType) {
		DeferredResult<BalancesResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		balanceService.findBalancesByAccountIds(defResult, psuIdentifier, accountIds, balanceType);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/balances")
	public DeferredResult<BalancesResponse> getBalance(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId,
			@RequestParam(required = false, name = "balanceType", defaultValue = "") OBBalanceTypeCode balanceType) {
		DeferredResult<BalancesResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
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
		DeferredResult<TransactionsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
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
		DeferredResult<TransactionsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		transactionService.findTransactionsByAccountId(defResult, psuIdentifier, accountId, page, status,
				creditDebitIndicator, fromBookingDateTime, toBookingDateTime);
		return defResult;
	}

	@GetMapping("/beneficiaries")
	public DeferredResult<BeneficiariesResponse> getBeneficiaries(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifier,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<BeneficiariesResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		beneficiaryService.findBeneficiaries(defResult, psuIdentifier, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/beneficiaries")
	public DeferredResult<BeneficiariesResponse> getBeneficiary(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifier,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<BeneficiariesResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		beneficiaryService.findBeneficiariesAccountId(defResult, psuIdentifier, accountId);
		return defResult;
	}

	@GetMapping("/direct-debits")
	public DeferredResult<DirectDebitsResponse> getDirectDebits(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<DirectDebitsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		directDebitService.findDirectDebits(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/direct-debits")
	public DeferredResult<DirectDebitsResponse> getDirectDebit(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<DirectDebitsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		directDebitService.findDirectDebitByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/offers")
	public DeferredResult<OffersResponse> getOffers(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<OffersResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		offerService.findOffers(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/offers")
	public DeferredResult<OffersResponse> getOffer(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<OffersResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		offerService.findOffersByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/scheduled-payments")
	public DeferredResult<ScheduledPaymentsResponse> getFuturDatedPayment(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<ScheduledPaymentsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		scheduledPaymentService.findScheduledPayments(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/scheduled-payments")
	public DeferredResult<ScheduledPaymentsResponse> getFuturDatedPayments(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<ScheduledPaymentsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		scheduledPaymentService.findScheduledPaymentByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/standing-orders")
	public DeferredResult<StandingOrdersResponse> getStandingOrders(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@RequestParam(required = false, name = "accountIds", defaultValue = "") List<String> accountIds) {
		DeferredResult<StandingOrdersResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		standingOrderService.findStandingOrders(defResult, psuIdentifierObj, accountIds);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/standing-orders")
	public DeferredResult<StandingOrdersResponse> getStandingOrder(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<StandingOrdersResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		standingOrderService.findStandingOrderByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@PostMapping("/payments")
	@ResponseStatus(HttpStatus.CREATED)
	public DeferredResult<PaymentsResponse> makePayments(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@Valid @RequestBody PaymentsRequest paymentsRequest) {
		DeferredResult<PaymentsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		paymentService.makePayment(defResult, psuIdentifierObj, paymentsRequest);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/supplementary-account-info")
	public DeferredResult<SupplementaryAccountInfoResponse> getSupplementaryAccountIfo(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = false) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<SupplementaryAccountInfoResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		supplementaryAccountInfoService.findSupplementaryAccountInfoByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/products")
	public DeferredResult<ProductsResponse> getProducts() {
		DeferredResult<ProductsResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		productService.findProducts(defResult);
		return defResult;
	}

	@GetMapping("/party")
	public DeferredResult<PartyResponse> getParty(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj) {
		DeferredResult<PartyResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		partyService.findCustomer(defResult, psuIdentifierObj);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/party")
	public DeferredResult<PartyResponse> getAccountParty(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<PartyResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		partyService.findCustomerByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@GetMapping("/accounts/{accountId}/parties")
	public DeferredResult<PartiesResponse> getAccountParties(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj,
			@PathVariable(value = "accountId", required = true) String accountId) {
		DeferredResult<PartiesResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		partyService.findCustomersByAccountId(defResult, psuIdentifierObj, accountId);
		return defResult;
	}

	@PostMapping("/paymentCharges")
	public DeferredResult<PaymentChargesResponse> getPaymentCharges(
			@RequestAttribute(name = "X-TG-PsuIdentifier", required = true) PsuIdentifiers psuIdentifierObj,
			@Valid @RequestBody PaymentChargesRequest paymentChargesRequest) {
		DeferredResult<PaymentChargesResponse> defResult = new DeferredResult<>(DEFAULT_DEFERRED_TIMEOUT);
		paymentChargesService.getPaymentCharges(defResult, psuIdentifierObj, paymentChargesRequest);
		return defResult;
	}
}