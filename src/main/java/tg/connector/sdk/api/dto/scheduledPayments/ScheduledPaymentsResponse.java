package tg.connector.sdk.api.dto.scheduledPayments;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.connector.sdk.api.model.common.MetaObject;
import tg.connector.sdk.api.model.scheduledPayments.ScheduledPayment;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ScheduledPaymentsResponse {	
	
	@JsonProperty("data")
	private List<ScheduledPayment> data;
	
	@JsonProperty("meta")
	private MetaObject meta;


}
