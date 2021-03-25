package tg.connector.sdk.api.model.common;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditorDebtorAccount {

	@JsonProperty("schemeName")
	private String schemeName;

	@JsonProperty("identification")
	private String identification;
	
	@JsonProperty("secondaryIdentification")
	private String secondaryIdentification;

	@JsonProperty("name")
	private String name;

}