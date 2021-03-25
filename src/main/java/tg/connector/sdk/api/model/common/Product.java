package tg.connector.sdk.api.model.common;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Product {
	@JsonProperty("id")
	private String id;
	@JsonProperty("productName")
	private String productName;
}