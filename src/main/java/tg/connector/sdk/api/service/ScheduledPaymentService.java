package tg.connector.sdk.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.connector.sdk.api.dto.scheduledPayments.ScheduledPaymentsResponse;
import tg.connector.sdk.api.model.common.PsuIdentifiers;

@Service
public interface ScheduledPaymentService {

	ScheduledPaymentsResponse findScheduledPayments(PsuIdentifiers psuIdentifierObj, List<String> accountIds);

	ScheduledPaymentsResponse findScheduledPaymentByAccountId(PsuIdentifiers psuIdentifierObj, String accountId);

}
