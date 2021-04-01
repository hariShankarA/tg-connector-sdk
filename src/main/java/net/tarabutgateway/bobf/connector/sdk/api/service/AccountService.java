package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.accounts.AccountResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.accounts.AccountsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface AccountService {

	@Async
	void findAccounts(DeferredResult<AccountsResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);
	@Async
	void findByAccountId(DeferredResult<AccountResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
