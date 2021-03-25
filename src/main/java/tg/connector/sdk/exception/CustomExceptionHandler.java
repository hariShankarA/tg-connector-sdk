package tg.connector.sdk.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.netflix.hystrix.exception.HystrixRuntimeException;

import brave.Tracer;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class CustomExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@Autowired
	private Tracer tracer;

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	@ExceptionHandler({ MethodArgumentTypeMismatchException.class, HttpMessageNotReadableException.class,
			HttpMediaTypeNotAcceptableException.class, UnsatisfiedServletRequestParameterException.class,
			MissingServletRequestParameterException.class, MissingRequestHeaderException.class

	})
	public ErrorResponse handleInvalidRequests(Exception ex) {
		LOGGER.error("Invalid Request", ex);
		String message = ex.getMessage() != null ? ex.getMessage() : "NULL";
		return new ErrorResponse(HttpStatus.BAD_GATEWAY, message, tracer.currentSpan().context().traceIdString());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	@ExceptionHandler(HystrixRuntimeException.class)
	public ResponseEntity<ErrorResponse> handleHystrixRuntimeException(HystrixRuntimeException ex) {

		LOGGER.error("HystrixRuntimeException", ex);

		if (ex.getCause() instanceof feign.FeignException) {
			feign.FeignException fe = (feign.FeignException) ex.getCause();
			String message = "FeignStatus=" + fe.status();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
					new ErrorResponse(HttpStatus.BAD_REQUEST, message, tracer.currentSpan().context().traceIdString()));

		} else {
			String message = ex.getMessage() != null ? ex.getMessage() : "NULL";
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
					new ErrorResponse(HttpStatus.BAD_REQUEST, message, tracer.currentSpan().context().traceIdString()));
		}
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	@ExceptionHandler(InvalidParamsException.class)
	public ErrorResponse handleParamsNotAvailabe(InvalidParamsException ex) {

		LOGGER.error("InvalidParamsException Exception");
		String message = ex.getMessage() != null ? ex.getMessage() : "NULL";
		return new ErrorResponse(HttpStatus.BAD_REQUEST, message, tracer.currentSpan().context().traceIdString());
	}

}
