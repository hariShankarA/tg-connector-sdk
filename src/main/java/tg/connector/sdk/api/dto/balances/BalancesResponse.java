package tg.connector.sdk.api.dto.balances;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.balances.BalanceData;
import tg.connector.sdk.api.model.common.MetaObject;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BalancesResponse {

	@JsonProperty("data")
	private List<BalanceData> data;

	@JsonProperty("meta")
	private MetaObject meta;
}
