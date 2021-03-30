package net.tarabutgateway.bobf.connector.sdk.api.dto.transactions;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;
import net.tarabutgateway.bobf.connector.sdk.api.model.transactions.TransactionData;

@Data
@Builder
public class TransactionsResponse {

	private List<TransactionData> data;

	private MetaObject meta;

}
