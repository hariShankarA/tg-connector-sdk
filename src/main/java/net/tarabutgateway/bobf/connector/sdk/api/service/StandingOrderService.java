package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.standingorders.StandingOrdersResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface StandingOrderService {

	@Async
	void findStandingOrders(DeferredResult<StandingOrdersResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	@Async
	void findStandingOrderByAccountId(DeferredResult<StandingOrdersResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
