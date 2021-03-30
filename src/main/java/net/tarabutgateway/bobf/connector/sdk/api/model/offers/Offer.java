package net.tarabutgateway.bobf.connector.sdk.api.model.offers;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Amount;

@Data
@Builder
public class Offer {

	private String accountId;
	private Amount amount;
	private String description;
	private String endDateTime;
	private Amount fee;
	private String offerid;
	private String offerType;
	private String rate;
	private String startDateTime;
	private String term;
	private String url;
	private String value;

}
