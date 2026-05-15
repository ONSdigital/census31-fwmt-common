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
public class Payload {

    @ApiModelProperty(notes = "List of fulfillment requests")
    private PauseFulfilmentRequest fulfilmentRequest = null;
}
