package uk.gov.ons.census.fwmt.common.data.fulfillment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString(exclude = {"requesterTitle", "requesterForename", "requesterSurname", "telNo"})
public class Contact {

  @ApiModelProperty(notes = "For posting paper I forms (H/H1 can be addressed to household)")
  @Size(max = 20)
  private String requesterTitle;

  @ApiModelProperty(notes = "For posting paper I forms (H/H1 can be addressed to household)")
  @Size(max = 35)
  private String requesterForename;

  @ApiModelProperty(notes = "For posting paper I forms (H/H1 can be addressed to household)")
  @Size(max = 35)
  private String requesterSurname;

  @ApiModelProperty(notes = "For texting UACs")
  @Size(max = 13)
  private String telNo;

}