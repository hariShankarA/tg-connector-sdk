package net.tarabutgateway.bobf.connector.sdk.model.parties;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class PartyResponse {

	private PartyResponseData data;
	private MetaObject meta;

}
