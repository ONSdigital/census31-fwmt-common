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
@ToString
public class CeCaseExtension {
  @JsonProperty(required = true) @Builder.Default private boolean ce1Complete = false;
  @JsonProperty(required = true) @Builder.Default private boolean deliveryRequired = false;
  @JsonProperty(required = true) @Builder.Default private int expectedResponses = 0;
  @JsonProperty(required = true) @Builder.Default private int actualResponses = 0;
}
