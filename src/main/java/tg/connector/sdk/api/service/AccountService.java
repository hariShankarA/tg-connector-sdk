package tg.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.connector.sdk.api.dto.accounts.AccountResponse;
import tg.connector.sdk.api.dto.accounts.AccountsResponse;
import tg.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface AccountService {

	AccountsResponse findAccounts(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	AccountResponse findByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
