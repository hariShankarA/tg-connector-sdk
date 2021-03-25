package tg.connector.sdk.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Amount {
	@JsonProperty("amount")
	private String amount;
	@JsonProperty("currency")
	private String currency;

}