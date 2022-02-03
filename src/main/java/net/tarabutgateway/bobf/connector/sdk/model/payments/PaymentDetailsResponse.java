package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class PaymentDetailsResponse {

	@JsonProperty("data")
	private List<PaymentsDetailsResponseData> data;
	@JsonProperty("meta")
	private MetaObject meta;
}