package net.tarabutgateway.bobf.connector.sdk.api.model.transactions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardInstrument {

	private OBCardSchemeName cardSchemeName;
	private OBCardAuthorizationType authorizationType;
	private String name;
	private String identificiation;
}