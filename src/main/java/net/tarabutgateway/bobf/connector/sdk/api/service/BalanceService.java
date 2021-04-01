package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.balances.BalancesResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.balances.OBBalanceTypeCode;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface BalanceService {

	@Async
	void findBalancesByAccountIds(DeferredResult<BalancesResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds,
			OBBalanceTypeCode balanceType);
	@Async
	void findBalancesByAccountId(DeferredResult<BalancesResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId,
			OBBalanceTypeCode balanceType);

}
