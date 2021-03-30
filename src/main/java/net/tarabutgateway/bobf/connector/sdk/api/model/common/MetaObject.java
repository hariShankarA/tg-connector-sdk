package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MetaObject {

	@JsonInclude(Include.NON_NULL)
	private Boolean paginated;
	@JsonInclude(Include.NON_NULL)
	private Integer totalPages;

}