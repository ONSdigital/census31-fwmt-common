package uk.gov.ons.census.fwmt.common.data.fulfillment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Event {

    @ApiModelProperty(notes = "")
    private String type;

    @ApiModelProperty(notes = "")
    private String source;

    @ApiModelProperty(notes = "")
    private String channel;

    @ApiModelProperty(notes = "Date/time of the recorded the outcome")
    private Timestamp dateTime;

    @ApiModelProperty(notes = "Unique identifier for the request")
    private String transactionId;
}
