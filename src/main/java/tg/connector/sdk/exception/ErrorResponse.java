package tg.connector.sdk.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

public class ErrorResponse {

	@Getter
	private final HttpStatus errorMessage;
	@Getter
	private final String errorCode;
	@Getter
	private final String traceId;

	public ErrorResponse(HttpStatus errorMessage, String errorCode, String traceId) {

		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.traceId = traceId;

	}

}
