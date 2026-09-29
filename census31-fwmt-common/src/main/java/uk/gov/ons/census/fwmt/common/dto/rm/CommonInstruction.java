package uk.gov.ons.census.fwmt.common.dto.rm;

public interface CommonInstruction {
  public ActionInstructionType getActionInstruction();

  public String getSurveyName();

  public String getAddressType();

  public String getAddressLevel();

  public boolean isNc();

  public String getCaseId();

}
