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
public class CardInstrument {

	@JsonProperty("cardSchemeName")
	private OBCardSchemeName cardSchemeName;
	@JsonProperty("authorizationType")
	private OBCardAuthorizationType authorizationType;
	@JsonProperty("name")
	private String name;
	@JsonProperty("identificiation")
	private String identificiation;
}