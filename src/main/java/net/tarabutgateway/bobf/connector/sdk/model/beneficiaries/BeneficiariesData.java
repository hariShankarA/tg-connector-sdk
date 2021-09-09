package net.tarabutgateway.bobf.connector.sdk.model.beneficiaries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BeneficiariesData {

	private String accountId;

	private String beneficiaryType;

	private CreditorAccount creditorAccount;

	private String reference;

	private Servicer servicer;

	private String beneficiaryId;

}
