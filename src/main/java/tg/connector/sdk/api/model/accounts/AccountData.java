package tg.connector.sdk.api.model.accounts;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Product;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountData {

	@JsonProperty("id")
	private String id;
	@JsonProperty("product")
	private Product product;
	@JsonProperty("multiAuth")
	private boolean multiAuth;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("businessCustomer")
	private List<BusinessCustomer> businessCustomer;
	@JsonProperty("customers")
	private List<Customer> customers;
	@JsonProperty("accountNumbers")
	private List<AccountNumber> accountNumbers;
	@JsonProperty("status")
	private OBAccountStatusCode status;
	@JsonProperty("accountType")
	private OBExternalAccountTypeCode accountType;
	@JsonProperty("accountSubType")
	private OBExternalAccountSubTypeCode accountSubType;
	@JsonProperty("description")
	private String description;
	@JsonProperty("nickName")
	private String nickName;
	@JsonProperty("openingDate")
	private Date openingDate;
	@JsonProperty("maturityDate")
	private Date maturityDate;

}