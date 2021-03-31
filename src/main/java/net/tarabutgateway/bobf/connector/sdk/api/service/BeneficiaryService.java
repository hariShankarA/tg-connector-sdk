package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.beneficiaries.BeneficiariesResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface BeneficiaryService {
	BeneficiariesResponse findBeneficiaries(DeferredResult<BeneficiariesResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	BeneficiariesResponse findBeneficiariesAccountId(DeferredResult<BeneficiariesResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);
}