package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString
public class CCSInterviewOutcome extends CommonOutcome {


  @ApiModelProperty(notes = "For CCS Cases, the 'category' on the case  record in COMET is set to either \"HH\" or"
      + " \"CE\" (see XXX #1- canonical-RM adapter mapping)."
      + " This is to enable future differentiation between HH and CE cases where the same secondary outcome may need to"
      + " drive different behaviour.")
  private String category;

  @ApiModelProperty(notes = "Flag to indicate whether Dummy Information has been collected")
  private Boolean dummyInfoCollected;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

}
