package net.tarabutgateway.bobf.connector.sdk.model.common;

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

	private String accountId;
	private String accountType;
}