package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tpp {

	@JsonProperty("clientId")
	private String clientId;
	@JsonProperty("orgId")
	private String orgId;
	@JsonProperty("softwareStatementId")
	private String softwareStatementId;
	@JsonProperty("tppName")
	private String tppName;
	@JsonProperty("directoryRecord")
	private DirectoryRecord directoryRecord;
}