package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.beneficiaries.BeneficiariesResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface BeneficiaryService {
	
	@Async
	void findBeneficiaries(DeferredResult<BeneficiariesResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	@Async
	void findBeneficiariesAccountId(DeferredResult<BeneficiariesResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);
}