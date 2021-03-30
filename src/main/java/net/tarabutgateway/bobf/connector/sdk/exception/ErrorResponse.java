package net.tarabutgateway.bobf.connector.sdk.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {

	private final HttpStatus errorMessage;
	private final String errorCode;
	private final String traceId;

}
