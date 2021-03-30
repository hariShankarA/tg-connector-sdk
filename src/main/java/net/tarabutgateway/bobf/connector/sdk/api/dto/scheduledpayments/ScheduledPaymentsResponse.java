package net.tarabutgateway.bobf.connector.sdk.api.dto.scheduledpayments;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;
import net.tarabutgateway.bobf.connector.sdk.api.model.scheduledpayments.ScheduledPayment;

@Data
@Builder

public class ScheduledPaymentsResponse {

	private List<ScheduledPayment> data;

	private MetaObject meta;

}
