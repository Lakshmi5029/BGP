@cognizant
Feature: Form Submission Section

  Background:
    Given launch application url
    When user login to basic login page
      | User_Name | public     |
      | Password  | Let$BeC001 |

  @form @AC2
  Scenario:Submit and Review all the forms in MRA
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
    And click on Yes for all the questions
    And click on Save button
    And verify provided credentials are displayed after refresh
    And click on CONTACT_DETAILS page
    #Can be saved to Json and used for further inputs
    And fill contacts details
      | Name                    | Lakshmi balasubramaniam    |
      | JobTitle                | Testing                    |
      | ContactNo               | 75765766                   |
      | Email                   | lakshmi.bala5029@gmail.com |
      | AlternateEmail          | guru5029@gmail.com         |
      | SameAsRegisteredAddress | True                       |
      | PostalCode              | 650230                     |
      | Block                   | 230                        |
      | Street                  | BUKIT BATOK EAST AVENUE 3  |
      | sameAsMainContactPerson | True                       |
    And click on Save button
    And click on PROPOSAL page
    And fill Proposal page
      | ProjectTitle       | test         |
      | StartDate          | 16 Jun 2022  |
      | EndDate            | 16 Jun 2022  |
      | ProjectDescription | test         |
      | Activity           | Market Entry |
      | TargetMarket       | Albania      |
      | Question           | Yes          |
    And click on Save button
    And click on BUSINESS_IMPACT page
    And fill BusinessImpact page
    |FyEndDate|16 Jun 2022|
    |OverSeasSales|100     |
    |OverSeasInvestment|170|
    |RationalRemarks   |test|
    |NonTangibleBenefits|test123|
    And click on Save button