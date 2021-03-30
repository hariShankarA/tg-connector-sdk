package net.tarabutgateway.bobf.connector.sdk.api.model.accounts;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import net.tarabutgateway.bobf.connector.sdk.api.model.common.Product;

@Data
@Builder
public class AccountData {

	private String id;
	private Product product;
	@Builder.Default
	private boolean multiAuth = false;
	private String currency;
	private List<BusinessCustomer> businessCustomer;
	private List<Customer> customers;
	private List<AccountNumber> accountNumbers;
	private OBAccountStatusCode status;
	private OBExternalAccountTypeCode accountType;
	private OBExternalAccountSubTypeCode accountSubType;
	private String description;
	private String nickName;
	private Date openingDate;
	private Date maturityDate;

}