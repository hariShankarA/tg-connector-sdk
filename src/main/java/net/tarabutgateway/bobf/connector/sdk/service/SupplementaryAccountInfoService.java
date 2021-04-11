package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo.SupplementaryAccountInfoResponse;

@Service
public interface SupplementaryAccountInfoService {

	@Async
	void findSupplementaryAccountInfoByAccountId(DeferredResult<SupplementaryAccountInfoResponse> defResult,
			PsuIdentifiers psuIdentifierObj, String accountId);

}
