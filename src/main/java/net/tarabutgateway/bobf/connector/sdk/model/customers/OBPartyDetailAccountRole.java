package net.tarabutgateway.bobf.connector.sdk.model.customers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBPartyDetailAccountRole {

	BH_OBF_ADMINISTRATOR("BH.OBF.Administrator"), BH_OBF_BENEFICIARY("BH.OBF.Beneficiary"),
	BH_OBF_CUSTODIANFORMINOR("BH.OBF.CustodianForMinor"), BH_OBF_GRANTER("BH.OBF.Granter"),
	BH_OBF_LEGALGUARDIAN("BH.OBF.LegalGuardian"), BH_OBF_OTHERPARTY("BH.OBF.OtherParty"),
	BH_OBF_POWEROFATTORNEY("BH.OBF.PowerOfAttorney"), BH_OBF_PRINCIPAL("BH.OBF.Principal"),
	BH_OBF_PROTECTOR("BH.OBF.Protector"), BH_OBF_REGISTEREDSHAREDNAME("BH.OBF.RegisteredSharedName");

	private final String value;

	private OBPartyDetailAccountRole(String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static OBPartyDetailAccountRole fromName(String text) {
		for (OBPartyDetailAccountRole b : OBPartyDetailAccountRole.values()) {
			if (String.valueOf(b.name()).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
