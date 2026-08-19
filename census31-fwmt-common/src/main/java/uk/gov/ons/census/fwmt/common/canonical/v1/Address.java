package uk.gov.ons.census.fwmt.common.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Address {

  private String arid;

  private String uprn;

  private String line1;

  private String line2;

  private String line3;

  private String line4;

  private String townName;

  private String postCode;

  private BigDecimal latitude;

  private BigDecimal longitude;

  private String oa;

}
