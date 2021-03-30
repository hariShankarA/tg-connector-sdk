package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.tarabutgateway.bobf.connector.sdk.api.dto.standingorders.StandingOrdersResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface StandingOrderService {

	StandingOrdersResponse findStandingOrders(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	StandingOrdersResponse findStandingOrderByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
