package net.tarabutgateway.bobf.connector.sdk.model.products;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class ProductsResponse {

	private List data;
	private MetaObject meta;

}