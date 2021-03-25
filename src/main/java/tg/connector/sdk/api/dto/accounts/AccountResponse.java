package tg.connector.sdk.api.dto.accounts;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.accounts.AccountData;
import tg.connector.sdk.api.model.common.MetaObject;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponse {

	@JsonProperty("data")
	private AccountData data;

	@JsonProperty("meta")
	private MetaObject meta;

}