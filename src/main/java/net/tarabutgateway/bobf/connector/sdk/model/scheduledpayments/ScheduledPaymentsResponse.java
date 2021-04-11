package net.tarabutgateway.bobf.connector.sdk.model.scheduledpayments;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder

public class ScheduledPaymentsResponse {

	private List<ScheduledPayment> data;

	private MetaObject meta;

}
