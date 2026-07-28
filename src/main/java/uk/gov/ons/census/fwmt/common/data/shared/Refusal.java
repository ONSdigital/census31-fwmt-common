package uk.gov.ons.census.fwmt.common.data.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
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
  @JsonProperty(required = false)
  private Boolean householder = false;

  @ApiModelProperty(notes = "")
  @JsonProperty(required = false)
  private Boolean dangerous = false;

  @JsonSetter("householder")
  public void setHouseholder(Boolean householder) {
    this.householder = householder != null && householder;
  }

  @JsonSetter("dangerous")
  public void setDangerous(Boolean dangerous) {
    this.dangerous = dangerous != null && dangerous;
  }

}
