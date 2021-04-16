package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.parties.PartiesResponse;
import net.tarabutgateway.bobf.connector.sdk.model.parties.PartyResponse;

@Service
public interface PartyService {

	@Async
	void findCustomer(DeferredResult<PartyResponse> defResult, PsuIdentifiers psuIdentifierObj);

	@Async
	void findCustomerByAccountId(DeferredResult<PartyResponse> defResult, PsuIdentifiers psuIdentifierObj,
			String accountId);

	@Async
	void findCustomersByAccountId(DeferredResult<PartiesResponse> defResult, PsuIdentifiers psuIdentifierObj,
			String accountId);

}
