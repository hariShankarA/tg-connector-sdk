package tg.connector.sdk.api.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditLine {
	@JsonProperty("included")
	private boolean included;

	@JsonProperty("amount")
	private Amount amount;

}