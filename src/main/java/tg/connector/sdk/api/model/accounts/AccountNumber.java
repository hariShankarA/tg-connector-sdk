package tg.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AccountNumber {
	@JsonProperty("name")
	private String name;
	@JsonProperty("schemeName")
	private String schemeName;
	@JsonProperty("identification")
	private String identification;
	@JsonProperty("secondaryIdentification")
	private String secondaryIdentification;
}