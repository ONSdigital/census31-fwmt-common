package uk.gov.ons.census.fwmt.common.data.nc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseDetailsDTO {

  @JsonProperty("id")
  private UUID caseId;

  List<CaseDetailsEventDTO> events;

  private RefusalTypeDTO refusalReceived;

}
