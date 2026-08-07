package uk.gov.ons.census.fwmt.common.data.nc;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;
import uk.gov.ons.census.fwmt.common.data.shared.Refusal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString
public class NCOutcome extends CommonOutcome {

  @ApiModelProperty(notes = "Identifier to the field officer that accompanied the primary officer")
  private String accompanyingOfficerId;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

  @ApiModelProperty(notes = "Refusal object")
  private Refusal refusal;

}
