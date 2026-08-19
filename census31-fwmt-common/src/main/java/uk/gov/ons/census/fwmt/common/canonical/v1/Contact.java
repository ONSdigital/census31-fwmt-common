package uk.gov.ons.census.fwmt.common.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Contact {
    private String forename;

    private String surname;

    private String organisationName;

    private String phoneNumber;

    private String emailAddress;
}
