package net.tarabutgateway.bobf.connector.sdk.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostalAddress {

	@JsonProperty("AddressType")
	private OBPostalAddressType addressType;
	@JsonProperty("Department")
	private String department;
	@JsonProperty("SubDepartment")
	private String subDepartment;
	@JsonProperty("StreetName")
	private String streetName;
	@JsonProperty("BuildingNumber")
	private String buildingNumber;
	@JsonProperty("PostCode")
	private String postCode;
	@JsonProperty("TownName")
	private String townName;
	@JsonProperty("CountrySubDivision")
	private String countrySubDivision;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("AddressLine")
	private List<String> addressLine;
}