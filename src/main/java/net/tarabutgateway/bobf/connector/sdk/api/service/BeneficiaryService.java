package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.tarabutgateway.bobf.connector.sdk.api.dto.beneficiaries.BeneficiariesResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface BeneficiaryService {
	BeneficiariesResponse findBeneficiaries(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	BeneficiariesResponse findBeneficiariesAccountId(PsuIdentifiers psuIdentifierObj, String accountId);
}