package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CurrencyExchange {

	@JsonProperty("sourceCurrency")
	private String sourceCurrency;
	@JsonProperty("targetCurrency")
	private String targetCurrency;
	@JsonProperty("unitCurrency")
	private String unitCurrency;
	@JsonProperty("exchangeRate")
	private String exchangeRate;
	@JsonProperty("contractIdentification")
	private String contractIdentification;
	@JsonProperty("quotationDate")
	private String quotationDate;
	@JsonProperty("instructedAmount")
	private Amount instructedAmount;

}