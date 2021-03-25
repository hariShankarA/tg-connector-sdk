package tg.connector.sdk.api.model.accounts;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @Builder
public class Customer{
	@JsonProperty("id")
    private String id;
	@JsonProperty("customerName")
    private String customerName;
}