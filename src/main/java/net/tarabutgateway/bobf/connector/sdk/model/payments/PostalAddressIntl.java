package net.tarabutgateway.bobf.connector.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalAddressIntl {

	@JsonProperty("StreetName")
	private String streetName;
	@JsonProperty("AddressLine")
	private String addressLine;
	@JsonProperty("BuildingNumber")
	private String buildingNumber;
	@JsonProperty("TownName")
	private String townName;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("AddressType")
	private String addressType;
	@JsonProperty("PostCode")
	private String postCode;
	@JsonProperty("CountySubDivision")
	private String countySubDivision;
}