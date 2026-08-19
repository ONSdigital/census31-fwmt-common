package uk.gov.ons.census.fwmt.common.data.tm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"accessInformation"})
public class CaseAccessInformation {
  private UUID id;
  private UUID formResultId;
  private String accessInformation;
  private List<String> careCodes;
}
