package uk.gov.ons.census.fwmt.common.data.shared;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString(exclude = {"accessInfo"})
public class CommonOutcome {

  @ApiModelProperty(notes = "Case is passed into here in gateway to be used internally", hidden = true)
  private UUID caseId;

  @ApiModelProperty(notes = "Case is passed into here in gateway to be used internally", hidden = true)
  private String caseRef;

  @ApiModelProperty(notes = "Unique identifier for the request", required = true)
  private UUID transactionId;

  @ApiModelProperty(notes = "Date/time of the recorded the outcome", example = "2011-08-12T20:17:46.384Z", required = true)
  private Date eventDate;

  @ApiModelProperty(notes = "Identifier of the field officer that recorded the outcome", required = true)
  @Size(max = 10)
  private String officerId;

  @ApiModelProperty(notes = "Identifier of the field officer's coordinator Id", required = true)
  @Size(max = 10)
  private String coordinatorId;

  @ApiModelProperty(notes = "Primary outcome code, e.g. Non Valid Household", required = true)
  private String primaryOutcomeDescription;

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict")
  private String secondaryOutcomeDescription;

  @ApiModelProperty(notes = "The full outcome code in computer format (i.e. s-yy-zz); where s is survey type,"
      + " yy is primary and zz is secondary codes", required = true)
  private String outcomeCode;

  @ApiModelProperty(notes = "Address details for case")
  private Address address;

  @ApiModelProperty(notes = "Access/security info")
  private String accessInfo;

  @ApiModelProperty(notes = "Care Codes applied to the case, can be 0, 1 or more of:\n"
      + "Access control\n"
      + "Aggressive animal\n"
      + "Caution required")
  private List<CareCode> careCodes;

  @ApiModelProperty(notes = "List of fulfillment requests")
  private List<FulfilmentRequest> fulfilmentRequests = null;

}
