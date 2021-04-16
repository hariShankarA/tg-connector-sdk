package net.tarabutgateway.bobf.connector.sdk.model.parties;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

	private String addressType;
	private String department;
	private String subDepartment;
	private String street;
	private String building;
	private String postCode;
	private String town;
	private String countrySubDivision;
	private String country;
	private List<String> addressLine;

}