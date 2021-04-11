package net.tarabutgateway.bobf.connector.sdk.model.offers;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.model.common.MetaObject;

@Data
@Builder
public class OffersResponse {

	private List<Offer> data;

	private MetaObject meta;

}
