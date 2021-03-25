package tg.connector.sdk.api.model.beneficiaries;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servicer {

	@JsonProperty("schemeName")
	private String schemeName;

	@JsonProperty("identification")
	private String identification;
}
