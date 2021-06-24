package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentsResponseData {

	@JsonProperty("id")
	private String id;
	@JsonProperty("status")
	private OBPaymentStatusCode status;
	@JsonProperty("creationDateTime")
	private Date creationDateTime;
	@JsonProperty("statusUpdateDateTime")
	private Date statusUpdateDateTime;
<<<<<<< HEAD
	@JsonProperty("refundAccount")
	private RefundAccount refundAccount;
}
=======
	@JsonProperty("Refund")
	private Refund refund;
}
>>>>>>> fda3cc24e87b9852def2397be1ace61c6b4eb195
