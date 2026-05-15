package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;
import uk.gov.ons.census.fwmt.common.data.shared.FulfilmentRequest;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString
public class CCSPropertyListingOutcome extends CommonOutcome {

  @ApiModelProperty(notes = "Flag to indicate whether Dummy Information has been collected")
  private Boolean dummyInfoCollected;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

  @ApiModelProperty(notes = "The CCSPropertyListingOutcome may include a child FulfillmentRequest object.")
  private List<FulfilmentRequest> fulfilmentRequests = null;

  @ApiModelProperty(notes = "The Site case Id")
  private UUID siteCaseId;

}
