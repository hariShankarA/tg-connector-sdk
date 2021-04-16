package net.tarabutgateway.bobf.connector.sdk.model.parties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PartyResponseData {

	private String id;
	private String number;
	private String customerName;
	private String customerType;
	private Contact contact;

}