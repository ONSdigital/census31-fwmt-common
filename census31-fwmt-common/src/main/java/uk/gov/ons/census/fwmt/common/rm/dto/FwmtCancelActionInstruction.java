package uk.gov.ons.census.fwmt.common.rm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@ToString(callSuper = true)
public class FwmtCancelActionInstruction extends FwmtSuperInstruction implements FwmtCommonInstruction{
  private String addressType;
  private String addressLevel;
  private Integer ceExpectedCapacity;
  private Integer ceActualResponses;
  private boolean nc = false;

  // display only the details related to request routing
  public String toRoutingString() {
    return "FwmtCancelActionInstruction(" +
        "actionInstruction=" + this.actionInstruction + ", " +
        "surveyName=" + this.surveyName + ", " +
        "addressType=" + this.addressType + ", " +
        "addressLevel=" + this.addressLevel + ")";
  }
}
