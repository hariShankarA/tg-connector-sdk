package net.tarabutgateway.bobf.connector.sdk.exception;
public class InvalidParamsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidParamsException(Throwable t) {
		super(t);
	}
	
	public InvalidParamsException(String msg, Throwable t) {
		super(msg, t);
	}
	
	public InvalidParamsException(String msg) {
		super(msg);
	}
}