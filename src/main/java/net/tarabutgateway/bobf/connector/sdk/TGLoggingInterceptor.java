package net.tarabutgateway.bobf.connector.sdk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import net.tarabutgateway.bobf.connector.sdk.logging.EventLogger;
import net.tarabutgateway.bobf.connector.sdk.logging.EventType;

@Component
public class TGLoggingInterceptor extends HandlerInterceptorAdapter {

	@Value("${service.bank.id}")
	String bankId;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		if (ignoreLogging(request)) {
			return true;
		}

		EventLogger.log(EventType.HTTP_REQUEST, "TGLoggingInterceptor", "URI",
				request.getMethod() + " [" + request.getRequestURI() + "]", bankId);
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {

		if (ignoreLogging(request)) {
			return;
		}

		String responseStatus = HttpStatus.valueOf(response.getStatus()).toString();

		if (ex != null)
			responseStatus = responseStatus + "/" + ex.getMessage();

		EventLogger.log(EventType.HTTP_RESPONSE, "TGLoggingInterceptor", "STATUS", responseStatus, bankId);
	}

	private boolean ignoreLogging(HttpServletRequest request) {

		return "OPTIONS".equalsIgnoreCase(request.getMethod()) || request.getServletPath().equals("/error")
				|| request.getServletPath().startsWith("/actuator");
	}

}
