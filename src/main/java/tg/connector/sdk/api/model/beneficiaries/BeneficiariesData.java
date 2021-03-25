package tg.connector.sdk.api.model.beneficiaries;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tg.connector.sdk.api.model.common.CreditorDebtorAccount;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeneficiariesData {

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("beneficiaryType")
	private String beneficiaryType;

	@JsonProperty("creditorAccount")
	private CreditorDebtorAccount creditorAccount;

	@JsonProperty("reference")
	private String reference;

	@JsonProperty("servicer")
	private Servicer servicer;

}
