package net.tarabutgateway.bobf.connector.sdk.api.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;
import net.tarabutgateway.bobf.connector.sdk.api.model.payments.PaymentsResponseData;

@Data
@Builder
public class PaymentsResponse {

	@JsonProperty("data")
	private PaymentsResponseData data;
	@JsonProperty("meta")
	private MetaObject meta;
}