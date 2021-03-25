package tg.connector.sdk.api.model.directDebit;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.Amount;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectDebit {

	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("directDebitId")
	private String directDebitId;
	@JsonProperty("mandateIdentification")
	private String mandateIdentification;
	@JsonProperty("name")
	private String name;
	@JsonProperty("directDebitStatusCode")
	private OBDirectDebitStatusCode directDebitStatusCode;
	@JsonProperty("previousPaymentDateTime")
	private Date previousPaymentDateTime;
	@JsonProperty("previousPaymentAmount")
	private Amount previousPaymentAmount;
	@JsonProperty("frequency")
	private OBDirectDebitFrequency frequency;

}
