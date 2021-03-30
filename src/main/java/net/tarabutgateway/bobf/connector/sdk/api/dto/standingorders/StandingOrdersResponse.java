package net.tarabutgateway.bobf.connector.sdk.api.dto.standingorders;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;
import net.tarabutgateway.bobf.connector.sdk.api.model.standingorders.StandingOrder;

@Data
@Builder
public class StandingOrdersResponse {

	private List<StandingOrder> data;

	private MetaObject meta;
}
