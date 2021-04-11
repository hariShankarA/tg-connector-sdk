package net.tarabutgateway.bobf.connector.sdk.model.standingorders;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class StandingOrdersResponse {

	private List<StandingOrder> data;

	private MetaObject meta;
}
