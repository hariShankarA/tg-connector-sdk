package net.tarabutgateway.bobf.connector.sdk.model.products;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class ProductsResponse {

	@JsonProperty("data")
	public List data;
	@JsonProperty("meta")
	public MetaObject meta;

}