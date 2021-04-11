package net.tarabutgateway.bobf.connector.sdk.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.accounts.AccountResponse;
import net.tarabutgateway.bobf.connector.sdk.model.accounts.AccountsResponse;
import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;

@Service
public interface AccountService {

	@Async
	void findAccounts(DeferredResult<AccountsResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);
	@Async
	void findByAccountId(DeferredResult<AccountResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
