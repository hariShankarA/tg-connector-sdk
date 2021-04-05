package net.tarabutgateway.bobf.connector.sdk.api.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.payments.PaymentsRequest;
import net.tarabutgateway.bobf.connector.sdk.api.dto.payments.PaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface PaymentService {
	@Async
	void makePayment(DeferredResult<PaymentsResponse> defResult, PsuIdentifiers psuIdentifierObj,
			PaymentsRequest paymentsRequest);
}