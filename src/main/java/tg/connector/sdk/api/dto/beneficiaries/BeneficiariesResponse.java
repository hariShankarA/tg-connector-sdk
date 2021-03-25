package tg.connector.sdk.api.dto.beneficiaries;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tg.connector.sdk.api.model.beneficiaries.BeneficiariesData;
import tg.connector.sdk.api.model.common.MetaObject;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeneficiariesResponse {

	@JsonProperty("data")
	private List<BeneficiariesData> data;

	@JsonProperty("meta")
	private MetaObject meta;

}