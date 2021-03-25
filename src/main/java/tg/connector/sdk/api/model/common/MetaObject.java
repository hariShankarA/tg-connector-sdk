package tg.connector.sdk.api.model.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetaObject {


	@JsonProperty("paginated")
	@JsonInclude(Include.NON_NULL)
	private Boolean paginated;
	@JsonProperty("totalPages")
	@JsonInclude(Include.NON_NULL)
	private Integer totalPages;

}