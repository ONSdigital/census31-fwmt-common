package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"lat", "_long"})
public class Location {

  @JsonProperty(required = true)
  private Double lat;
  @JsonProperty(value = "long", required = true)
  private Double _long;

}
