package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.payments.PaymentStatusResponse;
import net.tarabutgateway.bobf.connector.sdk.model.payments.PaymentsRequest;
import net.tarabutgateway.bobf.connector.sdk.model.payments.PaymentsResponse;

@Service
public interface PaymentService {
	@Async
	void makePayment(DeferredResult<PaymentsResponse> defResult, PsuIdentifiers psuIdentifierObj,
			PaymentsRequest paymentsRequest);

	@Async
	void getPaymentStatus(DeferredResult<PaymentStatusResponse> defResult, PsuIdentifiers psuIdentifierObj,
			String paymentId);
}