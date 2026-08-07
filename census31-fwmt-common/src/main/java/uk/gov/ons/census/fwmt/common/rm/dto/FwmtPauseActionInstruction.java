package uk.gov.ons.census.fwmt.common.rm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class FwmtPauseActionInstruction extends FwmtSuperInstruction {
  private String addressType;
  private String pauseCode;

  // display only the details related to request routing
  public String toRoutingString() {
    return "FwmtCancelActionInstruction(" +
        "actionInstruction=" + this.actionInstruction + ", " +
        "surveyName=" + this.surveyName + ", " +
        "addressType=" + this.addressType + ", " +
        "pauseCode=" + this.pauseCode + ")";
  }
}
