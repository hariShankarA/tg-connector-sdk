package net.tarabutgateway.bobf.connector.sdk.model.parties;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class PartiesResponse {

	private List<PartyResponseData> data;
	private MetaObject meta;

}