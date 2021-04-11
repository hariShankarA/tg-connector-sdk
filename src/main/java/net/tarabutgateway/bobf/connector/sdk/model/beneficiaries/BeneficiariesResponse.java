package net.tarabutgateway.bobf.connector.sdk.model.beneficiaries;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class BeneficiariesResponse {

	private List<BeneficiariesData> data;

	private MetaObject meta;

}