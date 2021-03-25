package tg.connector.sdk.api.dto.standingOrders;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.MetaObject;
import tg.connector.sdk.api.model.standingOrders.StandingOrder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrdersResponse {

	@JsonProperty("data")
	private List<StandingOrder> data = null;
	@JsonProperty("meta")
	private MetaObject meta;
}
