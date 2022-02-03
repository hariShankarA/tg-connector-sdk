package net.tarabutgateway.bobf.connector.sdk.model.payments;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentsDetailsResponseData {

  @JsonProperty("id")
  private String id;
  @JsonProperty("DomesticVRPId")
  private String DomesticVRPId;
  @JsonProperty("status")
  private OBPaymentDetailsStatusCode status;
  @JsonProperty("creationDateTime")
  private Date creationDateTime;
  @JsonProperty("statusUpdateDateTime")
  private Date statusUpdateDateTime;
  @JsonProperty("refundAccount")
  private RefundAccount refundAccount;
  @JsonProperty("statusDetails")
  private List<StatusDetail> statusDetails;
}
