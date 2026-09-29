package uk.gov.ons.census.fwmt.common.dto.rm;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@ToString
public abstract class SuperInstruction {
  ActionInstructionType actionInstruction;
  String surveyName;
  String caseId;

  protected SuperInstruction() {
  }

  public abstract String toRoutingString();
}
