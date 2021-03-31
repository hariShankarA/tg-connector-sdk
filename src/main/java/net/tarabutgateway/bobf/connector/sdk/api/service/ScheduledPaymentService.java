package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.api.dto.scheduledpayments.ScheduledPaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface ScheduledPaymentService {

	ScheduledPaymentsResponse findScheduledPayments(DeferredResult<ScheduledPaymentsResponse> defResult, PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	ScheduledPaymentsResponse findScheduledPaymentByAccountId(DeferredResult<ScheduledPaymentsResponse> defResult, PsuIdentifiers psuIdentifierObj, String accountId);

}
