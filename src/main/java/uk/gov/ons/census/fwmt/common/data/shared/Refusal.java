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
@ToString(exclude = {"title", "firstname", "surname", "middlenames"})
public class Refusal {

  @ApiModelProperty(notes = "")
  private String title;

  @ApiModelProperty(notes = "")
  private String firstname;

  @ApiModelProperty(notes = "")
  private String surname;

  @ApiModelProperty(notes = "")
  private String middlenames;

  @ApiModelProperty(notes = "")
  private boolean householder;

  @ApiModelProperty(notes = "")
  private boolean dangerous = false;

}
