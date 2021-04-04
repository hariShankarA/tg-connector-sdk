package net.tarabutgateway.bobf.connector.sdk.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {

	private final HttpStatus errorCode;
	private final String errorMessage;
	private final String traceId;

}
