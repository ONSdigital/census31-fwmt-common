package uk.gov.ons.census.fwmt.common.data.tm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Pause to apply to a case.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CasePauseRequest {
  @JsonProperty(required = true)
  private String code;
  private String effectiveFrom;
  private String reason;
}
