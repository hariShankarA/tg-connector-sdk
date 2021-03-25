package tg.connector.sdk.api.dto.offers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.MetaObject;
import tg.connector.sdk.api.model.offers.Offer;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OffersResponse {
	
	@JsonProperty("data")
	private List<Offer> data;
	
	@JsonProperty("meta")
	private MetaObject meta;

}
