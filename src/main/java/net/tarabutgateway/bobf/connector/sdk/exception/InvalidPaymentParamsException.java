package net.tarabutgateway.bobf.connector.sdk.exception;

public class InvalidPaymentParamsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidPaymentParamsException(String message) {
        super(message);
    }

    public InvalidPaymentParamsException(String message, Throwable cause) {
        super(message, cause);
    }
}
