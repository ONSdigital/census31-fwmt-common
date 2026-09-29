package uk.gov.ons.census.fwmt.common.dto.fwmt;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PauseActionInstruction {

  private String actionInstruction;
  private String surveyName;
  private String caseId;
  private String addressType;
  private String addressLevel;
  private String pauseCode;
  private Instant pauseFrom;
}
