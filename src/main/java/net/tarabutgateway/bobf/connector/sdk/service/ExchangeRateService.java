package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.exchange.ExchangeRateRequest;
import net.tarabutgateway.bobf.connector.sdk.model.exchange.ExchangeRateResponse;

@Service
public interface ExchangeRateService {
	@Async
	void getExchangeRate(DeferredResult<ExchangeRateResponse> defResult, PsuIdentifiers psuIdentifierObj,
			ExchangeRateRequest exchangeRequest);
}