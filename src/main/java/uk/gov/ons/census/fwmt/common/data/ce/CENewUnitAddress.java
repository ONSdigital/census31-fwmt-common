package uk.gov.ons.census.fwmt.common.data.ce;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString(callSuper = true)
public class CENewUnitAddress extends CommonOutcome {

  @ApiModelProperty(notes = "The Site case Id (i.e. for SPG Site Id associated to a new Unit Address to be created; "
      + "if not provided, this shall be assumed to be a new Unlinked Address)")
  private UUID siteCaseId;

  private CeDetails ceDetails;

}
