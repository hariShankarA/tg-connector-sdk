package tg.connector.sdk.api.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostalAddress {

	@JsonProperty("addressType")
	private OBPostalAddressType addressType;
	@JsonProperty("department")
	private String department;
	@JsonProperty("subDepartment")
	private String subDepartment;
	@JsonProperty("streetName")
	private String streetName;
	@JsonProperty("buildingNumber")
	private String buildingNumber;
	@JsonProperty("postCode")
	private String postCode;
	@JsonProperty("townName")
	private String townName;
	@JsonProperty("countrySubDivision")
	private String countrySubDivision;
	@JsonProperty("country")
	private String country;
	@JsonProperty("addressLine")
	private List<String> addressLine;
}