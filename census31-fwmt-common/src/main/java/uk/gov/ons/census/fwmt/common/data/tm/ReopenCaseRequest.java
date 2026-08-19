package uk.gov.ons.census.fwmt.common.data.tm;

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
public class ReopenCaseRequest {
  private String id;
  private SurveyType surveyType;
  private Boolean blank;
  private Boolean uaa;
}
