package uk.gov.ons.census.fwmt.common.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CancelFieldWorkerJobRequest implements Serializable {

  private String actionType;

  private String gatewayType;

  private UUID caseId;

  private OffsetDateTime until;

  private String reason;

}
