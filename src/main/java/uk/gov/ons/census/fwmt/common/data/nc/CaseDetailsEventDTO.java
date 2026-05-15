package uk.gov.ons.census.fwmt.common.data.nc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseDetailsEventDTO {

  private UUID id;

  private String eventType;

  private OffsetDateTime eventDate;

  private String eventPayload;
}
