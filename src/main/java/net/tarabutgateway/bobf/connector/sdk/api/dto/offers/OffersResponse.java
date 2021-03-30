package net.tarabutgateway.bobf.connector.sdk.api.dto.offers;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.MetaObject;
import net.tarabutgateway.bobf.connector.sdk.api.model.offers.Offer;

@Data
@Builder
public class OffersResponse {

	private List<Offer> data;

	private MetaObject meta;

}
