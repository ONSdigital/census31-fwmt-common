package uk.gov.ons.census.fwmt.common.data.tm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"name", "phone", "email"})
public class Contact {
  @Builder.Default private String name = "The Occupier";
  private String organisationName;
  private String phone;
  private String email;
}
