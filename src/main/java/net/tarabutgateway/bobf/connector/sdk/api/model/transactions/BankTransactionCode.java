package net.tarabutgateway.bobf.connector.sdk.api.model.transactions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankTransactionCode {

	private String code;
	private String subCode;
}