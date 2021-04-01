package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.scheduledpayments.ScheduledPaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface ScheduledPaymentService {

	@Async
	void findScheduledPayments(DeferredResult<ScheduledPaymentsResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	@Async
	void findScheduledPaymentByAccountId(DeferredResult<ScheduledPaymentsResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
