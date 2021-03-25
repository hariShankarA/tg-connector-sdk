package tg.connector.sdk.api.model.transactions;

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
public class MerchantDetails {

	@JsonProperty("merchantName")
	private String merchantName;
	@JsonProperty("merchantCategoryCode")
	private String merchantCategoryCode;
}