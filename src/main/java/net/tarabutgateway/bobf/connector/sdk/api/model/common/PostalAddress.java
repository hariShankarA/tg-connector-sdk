package net.tarabutgateway.bobf.connector.sdk.api.model.common;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostalAddress {

	private OBPostalAddressType addressType;
	private String department;
	private String subDepartment;
	private String streetName;
	private String buildingNumber;
	private String postCode;
	private String townName;
	private String countrySubDivision;
	private String country;
	private List<String> addressLine;
}