package net.tarabutgateway.bobf.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.tarabutgateway.bobf.connector.sdk.api.dto.scheduledpayments.ScheduledPaymentsResponse;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface ScheduledPaymentService {

	ScheduledPaymentsResponse findScheduledPayments(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	ScheduledPaymentsResponse findScheduledPaymentByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
