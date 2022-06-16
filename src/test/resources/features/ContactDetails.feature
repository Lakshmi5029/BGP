@contactDetails @cognizant
Feature: Eligibility Section

  Background:
    Given launch application url
    When user login to basic login page
      | User_Name | public     |
      | Password  | Let$BeC001 |

  @contact @AC1 @AC2 @AC3 @AC4 @AC5
  Scenario:Validate Contact Details in MRA
    Given BGP login page is displayed
    When user login to BGP
      | Entity_ID     | BGPQETECH |
      | User_ID       | S1234567A |
      | User_Role     | Acceptor  |
      | User_FullName | Tan       |
    And verify Grants page is displayed
    And click on getNewGrant button
    And click on IT sector
    And click on the BRING_MY_BUSINESS grantto option
    And click on the MARKET_READINESS_ASSISTANCE Grant type
    And click on apply button
    And click on Proceed button
    And click on CONTACT_DETAILS page
    And fill contacts details
      | Name                    | Lakshmi balasubramaniam    |
      | JobTitle                | Testing                    |
      | ContactNo               | 75765766                   |
      | Email                   | lakshmi.bala5029@gmail.com |
      | AlternateEmail          | guru5029@gmail.com         |
      | SameAsRegisteredAddress | true                       |
      | PostalCode              | 650320                     |
      | Block                   | 320                        |
      | Street                  | BUKIT BATOK STREET 33      |
      | sameAsMainContactPerson | true                       |
    And click on Save button
    Then verify contacts details are saved



