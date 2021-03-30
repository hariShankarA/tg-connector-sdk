package net.tarabutgateway.bobf.connector.sdk.api.model.beneficiaries;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.CreditorDebtorAccount;

@Data
@Builder
public class BeneficiariesData {

	private String accountId;

	private String beneficiaryType;

	private CreditorDebtorAccount creditorAccount;

	private String reference;

	private Servicer servicer;

}
