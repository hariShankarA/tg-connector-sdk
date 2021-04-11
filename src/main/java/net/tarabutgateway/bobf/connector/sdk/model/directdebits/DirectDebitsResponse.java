package net.tarabutgateway.bobf.connector.sdk.model.directdebits;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class DirectDebitsResponse {

	private List<DirectDebit> data;

	private MetaObject meta;

}
