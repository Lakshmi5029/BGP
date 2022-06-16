package com.bgp.dataMembers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDetails {
    private String name;
    private String jobTitle;
    private String contactNo;
    private String email;
    private String alternateEmail;
    private Boolean sameMailingAddress;
    private String postalCode;
    private String blockNo;
    private String street;
    private String level;
    private String unit;
    private String buildingName;
    private Boolean sameAsMainContact;
    private String offerName;
    private String offerJobTitle;
    private String offerEmail;
}
