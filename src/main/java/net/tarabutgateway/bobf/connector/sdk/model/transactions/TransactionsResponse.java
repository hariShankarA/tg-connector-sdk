package net.tarabutgateway.bobf.connector.sdk.model.transactions;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class TransactionsResponse {

	private List<TransactionData> data;

	private MetaObject meta;

}
