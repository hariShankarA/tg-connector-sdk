package net.tarabutgateway.bobf.connector.sdk;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.tarabutgateway.bobf.connector.sdk.api.model.common.PsuIdentifiers;

@Component
public class TGAuthInterceptor extends HandlerInterceptorAdapter {

	private static final Logger LOGGER = LoggerFactory.getLogger(TGAuthInterceptor.class);

	private static final String ASPSP_ID = "o3-aspsp-id";
	private static final String ORG_ID = "o3-caller-org-id";
	private static final String CLIENT_ID = "o3-caller-client-id";
	private static final String STATEMENT_ID = "o3-caller-software-statement-id";
	private static final String API_URI = "o3-api-uri";
	private static final String API_OPERATION = "o3-api-operation";
	private static final String CONSENT_ID = "o3-consent-id";
	private static final String CALLER_INTERACTION_ID = "o3-caller-interaction-id";
	private static final String OZONE_INTERACTION_ID = "o3-ozone-interaction-id";
	private static final String PSU_IDENTIFIER = "o3-psu-identifier";
	private static final String ALPHA_NUMERIC = "^[a-zA-Z0-9]+$";
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		ObjectMapper objMapper = new ObjectMapper();
		PsuIdentifiers psuIdentifier = new PsuIdentifiers();

		// handle ignorable scenarios
		if ("OPTIONS".equalsIgnoreCase(request.getMethod()) || request.getServletPath().equals("/error")
				|| request.getServletPath().startsWith("/actuator") || request.getServletPath().startsWith("/v2/api-docs")) {
			return true;
		}
		
		if (StringUtils.isEmpty(request.getHeader(ASPSP_ID)) || request.getHeader(ASPSP_ID) == null
				|| !Pattern.compile(ALPHA_NUMERIC).matcher(request.getHeader(ASPSP_ID)).matches()) {
			LOGGER.error("Request with no aspsp id {}", ASPSP_ID);
			response.sendError(HttpStatus.BAD_REQUEST.value(), "No aspsp id");
			return false;
		}
		
		if (StringUtils.isEmpty(request.getHeader(API_URI))) {
			LOGGER.error("Request with no api URI {}", API_URI);
			response.sendError(HttpStatus.BAD_REQUEST.value(), "No api uri");
			return false;
		}
			
		if (StringUtils.isEmpty(request.getHeader(API_OPERATION))) {
			LOGGER.error("Request with no api operation {}", API_OPERATION);
			response.sendError(HttpStatus.BAD_REQUEST.value(), "No api operation");
			return false;
		}
		
		if (StringUtils.isEmpty(request.getHeader(OZONE_INTERACTION_ID))) {
			LOGGER.error("Request with no interaction id {}", OZONE_INTERACTION_ID);
			response.sendError(HttpStatus.BAD_REQUEST.value(), "No ozone interaction id");
			return false;
		}
		
		if (request.getHeader(PSU_IDENTIFIER) != null) {
			String psuIdentifierString = new String(Base64.decodeBase64(request.getHeader(PSU_IDENTIFIER).getBytes()));
			psuIdentifier = objMapper.readValue(psuIdentifierString, PsuIdentifiers.class);
		}
		
		request.setAttribute("X-TG-PsuIdentifier", psuIdentifier);
		return true;
	}
	
}
