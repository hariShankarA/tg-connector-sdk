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
public class CreditorDebtorAgent {

	@JsonProperty("schemeName")
	private String schemeName;
	@JsonProperty("identification")
	private String identification;
	@JsonProperty("name")
	private String name;
	@JsonProperty("postalAddress")
	private PostalAddress postalAddress;
}