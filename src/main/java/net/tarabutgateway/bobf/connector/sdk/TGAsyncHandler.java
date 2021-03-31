package net.tarabutgateway.bobf.connector.sdk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.async.WebAsyncManager;
import org.springframework.web.context.request.async.WebAsyncUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TGAsyncHandler extends HandlerInterceptorAdapter {
	private static final Object DEFERRED_INTERCEPTOR_KEY = new Object();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);
		asyncManager.registerDeferredResultInterceptor(DEFERRED_INTERCEPTOR_KEY, new TGDeferredInterceptor());

		return true;

	}
}