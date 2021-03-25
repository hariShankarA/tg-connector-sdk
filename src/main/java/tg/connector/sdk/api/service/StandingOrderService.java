package tg.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.connector.sdk.api.dto.standingOrders.StandingOrdersResponse;
import tg.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface StandingOrderService {

	StandingOrdersResponse findStandingOrders(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	StandingOrdersResponse findStandingOrderByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
