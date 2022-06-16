@eligibility
@cogizant
Feature: Eligibility Section

  Background:
    Given launch application url
    When user login to basic login page
      | User_Name | public     |
      | Password  | Let$BeC001 |

  @AC1
  Scenario: Validate all question
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
    Then verify eligibility questions are displayed

  @AC2 @AC3
  Scenario:Validate eligiblity questions by answering Yes or No
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
    And click on No for all the questions and verify FAQ page is displayed
    And click on Yes for all the questions
    And click on Save button
    And verify provided credentials are displayed after refresh










