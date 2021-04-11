package net.tarabutgateway.bobf.connector.sdk.model.transactions;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.Amount;

@Data
@Builder
public class CurrencyExchange {

	private String sourceCurrency;
	private String targetCurrency;
	private String unitCurrency;
	private String exchangeRate;
	private String contractIdentification;
	private String quotationDate;
	private Amount instructedAmount;

}