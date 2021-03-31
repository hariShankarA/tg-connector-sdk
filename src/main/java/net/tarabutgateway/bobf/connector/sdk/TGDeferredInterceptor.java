package net.tarabutgateway.bobf.connector.sdk;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.context.request.async.DeferredResultProcessingInterceptor;

@Component
public class TGDeferredInterceptor implements DeferredResultProcessingInterceptor {

	@Override
	public <T> boolean handleTimeout(NativeWebRequest request, DeferredResult<T> deferredResult) throws Exception {

		deferredResult.onTimeout(() -> {
			deferredResult.setErrorResult(
					ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body("Request timeout occurred."));
		});
		return false;
	}

}