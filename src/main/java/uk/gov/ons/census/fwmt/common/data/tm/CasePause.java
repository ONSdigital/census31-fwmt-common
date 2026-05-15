package uk.gov.ons.census.fwmt.common.data.tm;

import java.time.OffsetDateTime;
import java.util.List;

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
public class CasePause {
  private OffsetDateTime until;
  private String reason;
  private List<Link> _links;
}
