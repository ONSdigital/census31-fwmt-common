package uk.gov.ons.census.fwmt.common.data.shared;

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
@ToString
public class CareCode {

  @ApiModelProperty(notes = "Value of an applied care code on the case, an enumeration of Access control,"
      + " Aggressive animal and Caution required", required = true)
  private String careCode;

}