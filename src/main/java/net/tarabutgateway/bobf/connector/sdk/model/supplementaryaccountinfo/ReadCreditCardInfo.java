package net.tarabutgateway.bobf.connector.sdk.model.supplementaryaccountinfo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
