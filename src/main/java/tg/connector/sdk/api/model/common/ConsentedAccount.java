package tg.connector.sdk.api.model.common;

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

public class ConsentedAccount {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("accountType")
	private String accountType;
}