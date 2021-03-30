package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.tarabutgateway.bobf.connector.sdk.api.dto.directdebits.DirectDebitsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface DirectDebitService {

	DirectDebitsResponse findDirectDebits(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	DirectDebitsResponse findDirectDebitByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
