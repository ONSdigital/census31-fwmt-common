package uk.gov.ons.census.fwmt.common.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class UpdateFieldWorkerJobRequest {
  private String actionType;
  private String gatewayType;
  private UUID caseId;
  private String establishmentType;
  private String addressType;
  private String addressLevel;
  private boolean uaa;
  private boolean blankFormReturned;
  private OffsetDateTime holdUntil;
  private boolean ce1Complete;
  private int ceExpectedResponses;
  private int ceActualResponses;
}
