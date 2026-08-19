package uk.gov.ons.census.fwmt.common.data.spg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString(callSuper = true)
public class SPGNewStandaloneAddress extends CommonOutcome {

  @ApiModelProperty(notes = "Flag to indicate whether Dummy Information has been collected")
  private Boolean dummyInfoCollected;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

}
