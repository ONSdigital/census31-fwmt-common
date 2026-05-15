package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.OffsetDateTime;

/**
 * Coded pause. Provides a code to indicate the length of pause to apply.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CodedPauseRequest {
  @JsonProperty(required = true) private String code;
  @JsonProperty(required = true) private OffsetDateTime effectiveFrom;
  private String reason;
}
