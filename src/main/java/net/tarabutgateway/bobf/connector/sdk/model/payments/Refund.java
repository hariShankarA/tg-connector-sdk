package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.tarabutgateway.bobf.connector.sdk.model.common.CreditorDebtorAccount;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Refund {

	@JsonProperty("Account")
	private CreditorDebtorAccount debtorAccount;
}