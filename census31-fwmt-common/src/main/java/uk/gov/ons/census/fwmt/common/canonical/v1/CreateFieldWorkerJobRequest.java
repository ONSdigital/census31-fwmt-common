package uk.gov.ons.census.fwmt.common.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CreateFieldWorkerJobRequest implements Serializable {

  private String actionType;

  private String gatewayType;

  private UUID caseId;

  private String caseReference;

  private String caseType;

  private String surveyType;

  private String establishmentType;

  private String mandatoryResource;

  private String coordinatorId;

  private boolean blankFormReturned;

  private boolean uua;

  private boolean sai;

  private String description;

  private String specialInstructions;

  private String ccsQuestionnaireURL;

  private boolean ceDeliveryRequired;

  private boolean ceCE1Complete;

  private int ceExpectedResponses;

  private int ceActualResponses;

  private String category;

  private Contact contact;

  private Address address;

  private Pause pause;
}
