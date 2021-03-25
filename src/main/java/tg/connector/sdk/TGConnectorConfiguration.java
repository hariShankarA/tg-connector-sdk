package tg.connector.sdk;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import brave.Tracer;
import tg.connector.sdk.exception.ErrorResponse;

@Configuration
public class TGConnectorConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(TGConnectorConfiguration.class);

	@Bean
	public ObjectMapper objectMapper() {

		final ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.findAndRegisterModules();
		objectMapper.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES));
		objectMapper.registerModule(new ParameterNamesModule()).registerModule(new Jdk8Module())
				.registerModule(new JavaTimeModule());
		objectMapper.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		return objectMapper;
	}

	@Bean
	public ErrorAttributes errorAttributes(Tracer tracer, ObjectMapper objectMapper) {

		return new DefaultErrorAttributes() {

			@Override
			public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {

				Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);


				String message = errorAttributes.get("error") != null ? errorAttributes.get("error").toString() : null;
				Integer statusCode = (Integer) errorAttributes.getOrDefault("status", 500);

				Throwable ex = getError(webRequest);
				if (ex != null) {
					LOGGER.error("Container Exception", ex);
					message = ex.getMessage() != null ? ex.getMessage() : "NULL";
				}
				if (statusCode == 400) {
					message = "bank-connect.header.invalid";
				}
				ErrorResponse errorResponse = new ErrorResponse(HttpStatus.valueOf(statusCode), message,
						tracer.currentSpan().context().traceIdString());

				return objectMapper.convertValue(errorResponse, new TypeReference<Map<String, Object>>() {
				});

			}
		};
	}
	
	@Bean
	public WebMvcConfigurer webMvcConfigurer(TGLoggingInterceptor tgLoggingInterceptor,TGAuthInterceptor tgAuthInterceptor) {

		return new WebMvcConfigurer() {

			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(tgLoggingInterceptor);
				registry.addInterceptor(tgAuthInterceptor);
			}
		};

	}

}
