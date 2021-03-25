package tg.connector.sdk.api.dto.accounts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.accounts.AccountData;
import tg.connector.sdk.api.model.common.MetaObject;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountsResponse {

	@JsonProperty("data")
	private List<AccountData> data;
	
	@JsonProperty("meta")
	private MetaObject meta;


}