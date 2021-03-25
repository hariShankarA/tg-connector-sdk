package tg.connector.sdk.api.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankTransactionCode {

	@JsonProperty("code")
	private String code;
	@JsonProperty("subCode")
	private String subCode;
}