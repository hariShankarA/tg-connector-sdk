package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExchangeRateInformation {

	@JsonProperty("RateType")
	private String rateType;
	@JsonProperty("UnitCurrency")
	private String unitCurrency;
	@JsonProperty("ContractIdentification")
	private String contractIdentification;
	@JsonProperty("ExchangeRate")
	private String exchangeRate;
}