package uk.gov.ons.census.fwmt.common.data.tm;

public enum SurveyType {
  HH("HH"),
  NC("NC"),
  CE_EST("CE EST"),
  CE_EST_D("CE Est-D"),
  CE_EST_F("CE Est-F"),
  CE_SITE("CE Site"),
  CE_UNIT("CE UNIT"),
  CE_UNIT_D("CE Unit-D"),
  CE_UNIT_F("CE Unit-F"),
  CCS_PL("CCS PL"),
  CCS_INT("CCS INT"),
  AC("AC"),
  SPG_Site("SPG Site"),
  SPG_Secure_Site(null),
  SPG_Unit_D("SPG Unit-D"),
  SPG_Unit_F("SPG Unit-F");
  public final String name;

  SurveyType(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return name;
  }
}
