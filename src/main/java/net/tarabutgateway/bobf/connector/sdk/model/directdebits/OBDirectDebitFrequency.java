package net.tarabutgateway.bobf.connector.sdk.model.directdebits;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBDirectDebitFrequency {

	BH_OBF_ANNUAL("BH.OBF.Annual"), BH_OBF_DAILY("BH.OBF.Daily"), BH_OBF_FORTNIGHTLY("BH.OBF.Fortnightly"),
	BH_OBF_HALF_YEARLY("BH.OBF.HalfYearly"), BH_OBF_MONTHLY("BH.OBF.Monthly"),
	BH_OBF_NOT_KNOWN("BH.OBF.NotKnown"), BH_OBF_QAURTERLY("BH.OBF.Quarterly");

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
