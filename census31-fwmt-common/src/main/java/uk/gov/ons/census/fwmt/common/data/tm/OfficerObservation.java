package uk.gov.ons.census.fwmt.common.data.tm;

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
public class OfficerObservation {
  private UUID uuid;
  private String note;
  private OffsetDateTime date;
}
