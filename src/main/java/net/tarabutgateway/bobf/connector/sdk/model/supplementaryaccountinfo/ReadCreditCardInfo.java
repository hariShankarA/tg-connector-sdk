package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadCreditCardInfo {

	@JsonProperty("Rate")
	private String rate;

	@JsonProperty("CardLimit")
	private String cardLimit;

	@JsonProperty("GracePeriod")
	private String gracePeriod;

	@JsonProperty("URL")
	private String url;

}
