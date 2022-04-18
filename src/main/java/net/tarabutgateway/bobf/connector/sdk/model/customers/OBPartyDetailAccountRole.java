package net.tarabutgateway.bobf.connector.sdk.model.customers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OBPartyDetailAccountRole {

	UK_OBIE_ADMINISTRATOR("UK.OBIE.Administrator"), UK_OBIE_BENEFICIARY("UK.OBIE.Beneficiary"),
	UK_OBIE_CUSTODIANFORMINOR("UK.OBIE.CustodianForMinor"), UK_OBIE_GRANTER("UK.OBIE.Granter"),
	UK_OBIE_LEGALGUARDIAN("UK.OBIE.LegalGuardian"), UK_OBIE_OTHERPARTY("UK.OBIE.OtherParty"),
	UK_OBIE_POWEROFATTORNEY("UK.OBIE.PowerOfAttorney"), UK_OBIE_PRINCIPAL("UK.OBIE.Principal"),
	UK_OBIE_PROTECTOR("UK.OBIE.Protector"), UK_OBIE_REGISTEREDSHAREDNAME("UK.OBIE.RegisteredSharedName");

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
