package net.tarabutgateway.bobf.connector.sdk.model.beneficiaries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Servicer {

	private String schemeName;

	private String identification;
}
