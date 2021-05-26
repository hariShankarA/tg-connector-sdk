package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.common.PsuIdentifiers;
import net.tarabutgateway.bobf.connector.sdk.model.customers.CustomersResponse;
import net.tarabutgateway.bobf.connector.sdk.model.customers.CustomerResponse;

@Service
public interface CustomerService {

	@Async
	void findCustomer(DeferredResult<CustomerResponse> defResult, PsuIdentifiers psuIdentifierObj);

	@Async
	void findCustomersByAccountId(DeferredResult<CustomersResponse> defResult, PsuIdentifiers psuIdentifierObj,
			String accountId);

}
