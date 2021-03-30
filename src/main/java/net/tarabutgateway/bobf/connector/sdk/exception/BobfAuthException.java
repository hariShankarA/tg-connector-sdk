package net.tarabutgateway.bobf.connector.sdk.exception;
public class BobfAuthException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BobfAuthException(Throwable t) {
		super(t);
	}
	
	public BobfAuthException(String msg, Throwable t) {
		super(msg, t);
	}
	
	public BobfAuthException(String msg) {
		super(msg);
	}
}