package uk.gov.ons.census.fwmt.common.data.tm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OfficerResponse {
  private String id;
  private String reference;
  private WorkingAreaSlim workingArea;
  private String notes;
  private Integer contractedHours;
  private OfficerSummary summary;
  private List<OfficerObservation> observations;
}
