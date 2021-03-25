package tg.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.connector.sdk.api.dto.balances.BalancesResponse;
import tg.connector.sdk.api.model.balances.OBBalanceTypeCode;
import tg.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface BalanceService {

	BalancesResponse findBalancesByAccountIds(PsuIdentifiers psuIdentifierObj, List<String> accountIds,
			OBBalanceTypeCode balanceType);

	BalancesResponse findBalancesByAccountId(PsuIdentifiers psuIdentifierObj, String accountId,
			OBBalanceTypeCode balanceType);

}
