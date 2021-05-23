package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.paymentcharges.PaymentChargesRequest;
import net.tarabutgateway.bobf.connector.sdk.model.paymentcharges.PaymentChargesResponse;

@Service
public interface PaymentChargesService {
	@Async
	void getPaymentCharges(DeferredResult<PaymentChargesResponse> defResult, PsuIdentifiers psuIdentifierObj,
			PaymentChargesRequest paymentChargesRequest);
}