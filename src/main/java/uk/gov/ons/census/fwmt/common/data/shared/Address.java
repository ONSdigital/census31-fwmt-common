package uk.gov.ons.census.fwmt.common.data.shared;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString(exclude = {"addressLine1", "addressLine2", "addressLine3", "latitude", "longitude"})
public class Address {

  @ApiModelProperty(notes = "Address line 1", required = true)
  private String addressLine1;

  @ApiModelProperty(notes = "Address line 2")
  private String addressLine2;

  @ApiModelProperty(notes = "Address line 3")
  private String addressLine3;

  @ApiModelProperty(notes = "Locality (town)")
  private String locality;

  @ApiModelProperty(notes = "Postcode")
  private String postcode;

  @ApiModelProperty(notes = "Latitude", required = true)
  private BigDecimal latitude;

  @ApiModelProperty(notes = "Longitude", required = true)
  private BigDecimal longitude;

}
