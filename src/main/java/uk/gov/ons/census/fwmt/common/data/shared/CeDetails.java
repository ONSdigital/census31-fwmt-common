package uk.gov.ons.census.fwmt.common.data.shared;

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
@ToString(exclude = {"managerTitle","managerForename","managerSurname","contactPhone"})
public class CeDetails {

  @ApiModelProperty(notes = "Name of the CE")
  @Size(max = 60)
  private String establishmentName;

  @ApiModelProperty(notes = "Type of the establishment")
  @Size(max = 30)
  private String establishmentType;

  @ApiModelProperty(notes = "Establishment is a secure type")
  private boolean establishmentSecure;

  @ApiModelProperty(notes = "Title of the CE Manager e.g. Mr, Mrs - only used to add to case created in RM,"
      + " hence not needed to be  broken down to title, forename, surname.")
  @Size(max = 20)
  private String managerTitle;

  @ApiModelProperty(notes = "Forename of the CE Manager")
  @Size(max = 35)
  private String managerForename;

  @ApiModelProperty(notes = "Surname of the CE Manager")
  @Size(max = 35)
  private String managerSurname;

  @ApiModelProperty(notes = "The number of actual responses to be expected from the CE")
  private Integer usualResidents;

  @ApiModelProperty(notes = "Contact number of the CE")
  @Size(max = 13)
  private String contactPhone;

  @ApiModelProperty(notes = "Number of bedspaces")
  private String bedspaces;

}
