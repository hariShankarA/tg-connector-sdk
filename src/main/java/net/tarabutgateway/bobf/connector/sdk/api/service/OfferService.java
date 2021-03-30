package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.tarabutgateway.bobf.connector.sdk.api.dto.offers.OffersResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface OfferService {

	OffersResponse findOffers(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	OffersResponse findOffersByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);
}