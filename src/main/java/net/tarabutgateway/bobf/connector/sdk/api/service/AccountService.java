package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.tarabutgateway.bobf.connector.sdk.api.dto.accounts.AccountResponse;
import net.tarabutgateway.bobf.connector.sdk.api.dto.accounts.AccountsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface AccountService {

	AccountsResponse findAccounts(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	AccountResponse findByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
