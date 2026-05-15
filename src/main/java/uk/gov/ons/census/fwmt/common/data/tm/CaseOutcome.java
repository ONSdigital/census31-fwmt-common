package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CaseOutcome {
  private UUID id;
  private UUID visitId;
  private UUID formResultId;
  @JsonProperty(required = true) private OffsetDateTime formResultDate;
  @JsonProperty(required = true) private String officerReference;
  @JsonProperty(required = true) private String primaryCode;
  @JsonProperty(required = true) private String primaryDescription;
  @JsonProperty(required = true) private String secondaryCode;
  @JsonProperty(required = true) private String secondaryDescription;
  private Boolean dummyDataCollected;
}
