package tg.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.connector.sdk.api.dto.directDebit.DirectDebitsResponse;
import tg.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface DirectDebitService {

	DirectDebitsResponse findDirectDebits(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	DirectDebitsResponse findDirectDebitByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
