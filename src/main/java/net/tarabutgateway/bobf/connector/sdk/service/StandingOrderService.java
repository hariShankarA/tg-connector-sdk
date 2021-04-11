package net.tarabutgateway.bobf.connector.sdk.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.standingorders.StandingOrdersResponse;

@Service
public interface StandingOrderService {

	@Async
	void findStandingOrders(DeferredResult<StandingOrdersResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	@Async
	void findStandingOrderByAccountId(DeferredResult<StandingOrdersResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
