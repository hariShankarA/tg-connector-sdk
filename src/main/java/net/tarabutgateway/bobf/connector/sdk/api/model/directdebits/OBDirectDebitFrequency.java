package net.tarabutgateway.bobf.connector.sdk.api.model.directdebits;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBDirectDebitFrequency {

	UK_OBIE_ANNUAL("UK.OBIE.Annual"), UK_OBIE_DAILY("UK.OBIE.Daily"), UK_OBIE_FORTNIGHTLY("UK.OBIE.Fortnightly"),
	UK_OBIE_HALF_YEARLY("UK.OBIE.HalfYearly"), UK_OBIE_MONTHLY("UK.OBIE.Monthly"),
	UK_OBIE_NOT_KNOWN("UK.OBIE.NotKnown"), UK_OBIE_QAURTERLY("UK.OBIE.Quarterly");

	private final String value;

	private OBDirectDebitFrequency(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBDirectDebitFrequency fromName(String text) {
		for (OBDirectDebitFrequency b : OBDirectDebitFrequency.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;

	}

}
