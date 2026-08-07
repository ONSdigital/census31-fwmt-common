package uk.gov.ons.census.fwmt.common.data.fulfillment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class PauseOutcome {

  @ApiModelProperty(notes = "Event that has been sent that are agnostic to the channel")
  private Event event;

  @ApiModelProperty(notes = "Payload containing fulfillment request and individual case ID")
  private Payload payload;

}
