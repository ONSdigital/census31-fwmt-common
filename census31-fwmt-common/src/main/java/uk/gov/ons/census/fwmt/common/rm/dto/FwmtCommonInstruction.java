package uk.gov.ons.census.fwmt.common.rm.dto;

public interface FwmtCommonInstruction {
  public ActionInstructionType getActionInstruction();

  public String getSurveyName();

  public String getAddressType();

  public String getAddressLevel();

  public boolean isNc();

  public String getCaseId();

}
