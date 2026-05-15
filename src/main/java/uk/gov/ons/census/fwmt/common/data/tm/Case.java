package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@ToString(exclude = {"location", "description", "specialInstructions", "ccs"})
public class Case {
  private UUID id;
  private Integer priority;
  private Integer visitCount;
  private List<CaseOutcome> caseOutcomes;
  private List<CaseAccessInformation> caseAccessInformations;
  private Boolean dummyDataCollected;
  private OfficerResponse allocatedTo;
  private CaseState state;
  @JsonProperty(required = true) private String reference;
  private CaseType type;
  private SurveyType surveyType;
  @JsonProperty(required = true) String category;
  @JsonProperty(required = true) String estabType;
  @JsonProperty(required = true) String coordCode;
  private Contact contact;
  @JsonProperty(required = true) private Address address;
  @JsonProperty(required = true) private Location location;
  private String description;
  private String specialInstructions;
  @JsonProperty(required = true) @Builder.Default private boolean uaa = false;
  @JsonProperty(required = true) @Builder.Default private boolean sai = false;
  private CeCaseExtension ce;
  private CcsCaseExtension ccs;
  @Builder.Default private boolean requiresWelshSpeaker = false;
  private List<UUID> prohibitedOfficers;
  @Builder.Default private boolean blankFormReturned = false;
  private String requiredOfficer;
  private UUID requiredOfficerId;
  private OfficerResponse distributedToOfficer;
  private UUID distributedToOfficerId;
  private CasePause pause;
  private List<Link> _links;
}
