package net.tarabutgateway.bobf.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBAccountStatusCode {

	ENABLED("Enabled"), DISABLED("Disabled"), DELETED("Deleted"), PRO_FORMA("ProForma"), PENDING("Pending");

	private final String value;

	private OBAccountStatusCode(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBAccountStatusCode fromName(String text) {
		for (OBAccountStatusCode b : OBAccountStatusCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
