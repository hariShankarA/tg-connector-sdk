package net.tarabutgateway.bobf.connector.sdk.api.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.supplementaryaccountinfo.SupplementaryAccountInfoResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface SupplementaryAccountInfoService {

	@Async
	void findSupplementaryAccountInfoByAccountId(DeferredResult<SupplementaryAccountInfoResponse> defResult,
			PsuIdentifiers psuIdentifierObj, String accountId);

}
