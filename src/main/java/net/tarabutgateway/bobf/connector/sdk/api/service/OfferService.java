package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.offers.OffersResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface OfferService {

	@Async
	void findOffers(DeferredResult<OffersResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	@Async
	void findOffersByAccountId(DeferredResult<OffersResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);
}