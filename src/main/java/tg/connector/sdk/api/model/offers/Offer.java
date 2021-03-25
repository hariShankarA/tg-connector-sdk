package tg.connector.sdk.api.model.offers;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Offer {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("amount")
	private Amount amount;
	@JsonProperty("description")
	private String description;
	@JsonProperty("endDateTime")
	private String endDateTime;
	@JsonProperty("fee")
	private Amount fee;
	@JsonProperty("offerid")
	private String offerid;
	@JsonProperty("offerType")
	private String offerType;
	@JsonProperty("rate")
	private String rate;
	@JsonProperty("startDateTime")
	private String startDateTime;
	@JsonProperty("term")
	private String term;
	@JsonProperty("url")
	private String url;
	@JsonProperty("value")
	private String value;

}
