package net.tarabutgateway.bobf.connector.sdk.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.directdebits.DirectDebitsResponse;

@Service
public interface DirectDebitService {

	@Async
	void findDirectDebits(DeferredResult<DirectDebitsResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	@Async
	void findDirectDebitByAccountId(DeferredResult<DirectDebitsResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
