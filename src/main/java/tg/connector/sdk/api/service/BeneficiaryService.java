package tg.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.connector.sdk.api.dto.beneficiaries.BeneficiariesResponse;
import tg.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface BeneficiaryService {
	BeneficiariesResponse findBeneficiaries(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	BeneficiariesResponse findBeneficiariesAccountId(PsuIdentifiers psuIdentifierObj, String accountId);
}