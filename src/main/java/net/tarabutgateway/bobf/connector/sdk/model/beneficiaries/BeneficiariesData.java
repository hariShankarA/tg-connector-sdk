package net.tarabutgateway.bobf.connector.sdk.model.beneficiaries;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccount;

@Data
@Builder
public class BeneficiariesData {

	private String accountId;

	private String beneficiaryType;

	private CreditorDebtorAccount creditorAccount;

	private String reference;

	private Servicer servicer;

}
