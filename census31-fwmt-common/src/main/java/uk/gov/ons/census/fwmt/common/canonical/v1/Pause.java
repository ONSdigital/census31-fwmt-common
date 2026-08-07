package uk.gov.ons.census.fwmt.common.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Pause implements Serializable {
  
  private Date effectiveDate;
  
  private String code;
  
  private String reason;
  
  private OffsetDateTime holdUntil;
  
  //This class uses both Date and OffsetDateTime.
  //We're currently taking a lead from TM's API, and may change it to be consistent late.
}
