package net.tarabutgateway.bobf.connector.sdk.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import net.tarabutgateway.bobf.connector.sdk.model.products.ProductsResponse;

@Service
public interface ProductService {

	@Async
	void findProducts(DeferredResult<ProductsResponse> defResult);

}
