package net.tarabutgateway.bobf.connector.sdk.api.model.payments;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBLocalInstrumentCode {

	BH_OBF_DNS("BH.OBF.DNS"), BH_OBF_NRT("BH.OBF.NRT"), BH_OBF_BIL("BH.OBF.BIL");

	private final String value;

	private OBLocalInstrumentCode(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return value;
	}

	public static OBLocalInstrumentCode fromName(String text) {
		for (OBLocalInstrumentCode b : OBLocalInstrumentCode.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}

}