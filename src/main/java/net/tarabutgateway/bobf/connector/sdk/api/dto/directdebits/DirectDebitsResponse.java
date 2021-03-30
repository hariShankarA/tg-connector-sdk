package net.tarabutgateway.bobf.connector.sdk.api.dto.directdebits;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;
import net.tarabutgateway.bobf.connector.sdk.api.model.directdebits.DirectDebit;

@Data
@Builder
public class DirectDebitsResponse {

	private List<DirectDebit> data;

	private MetaObject meta;

}
