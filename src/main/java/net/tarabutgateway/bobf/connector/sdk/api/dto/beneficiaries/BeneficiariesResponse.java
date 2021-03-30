package net.tarabutgateway.bobf.connector.sdk.api.dto.beneficiaries;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.beneficiaries.BeneficiariesData;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;

@Data
@Builder
public class BeneficiariesResponse {

	private List<BeneficiariesData> data;

	private MetaObject meta;

}