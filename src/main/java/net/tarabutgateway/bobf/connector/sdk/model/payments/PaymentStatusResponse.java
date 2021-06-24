package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class PaymentStatusResponse {

	@JsonProperty("data")
	private PaymentsResponseData data;
	@JsonProperty("meta")
	private MetaObject meta;
}