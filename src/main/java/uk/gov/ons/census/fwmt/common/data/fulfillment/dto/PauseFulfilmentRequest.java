package uk.gov.ons.census.fwmt.common.data.fulfillment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class PauseFulfilmentRequest {

  @ApiModelProperty(notes = "")
  @Size(max = 16)
  private String fulfilmentCode;

  @ApiModelProperty(notes = "")
  private String caseId;

  @ApiModelProperty(notes = "")
  private Contact contact;

  @ApiModelProperty(notes = "Individual case is passed into here in gateway to be used internally")
  private String individualCaseId;

}