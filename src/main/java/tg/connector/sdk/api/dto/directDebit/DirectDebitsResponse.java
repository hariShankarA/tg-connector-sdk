package tg.connector.sdk.api.dto.directDebit;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.MetaObject;
import tg.connector.sdk.api.model.directDebit.DirectDebit;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectDebitsResponse {

	@JsonProperty("data")
	private List<DirectDebit> data;

	@JsonProperty("meta")
	private MetaObject meta;

}
