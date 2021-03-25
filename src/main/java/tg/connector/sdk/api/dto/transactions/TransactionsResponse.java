package tg.connector.sdk.api.dto.transactions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.MetaObject;
import tg.connector.sdk.api.model.transactions.TransactionData;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionsResponse {

	@JsonProperty("data")
	private List<TransactionData> data;
	
	@JsonProperty("meta")
	private MetaObject meta;


}
