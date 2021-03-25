package tg.connector.sdk.api.model.accounts;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBAccountStatusCode {

	ENABLED("Enabled"), DISABLED("Disabled"), DELETED("Deleted"), PRO_FORMA("ProForma"), PENDING("Pending");

	private String value;

	OBAccountStatusCode(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OBAccountStatusCode fromValue(String text) {
		for (OBAccountStatusCode b : OBAccountStatusCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
