Feature: created New Opportunitie

  Scenario Outline: User is able to create Opportunitie

    Given Open the Salesforce Website
    When verify the Salesforce page title as "Login | Salesforce"
    Then Login with valid username and password "<username>" and "<password>"
    And  Click login button
    And Verify Salesforce Home page title as "Home | Salesforce"
    Then Click on the Opportunities tab
    Then Click on the New button
    Then Select a record type and click Next
    Then Verify Required fields message
    Then Save button
    And  Populate System Admin Layout fields
    And Opportunity Information
    And Interested In Attributes
    And Interested In Details
    And Towing Information
    And Currently Own Trade-InCurrently Own TradeIn from Web Lead fields
    And Populate Info from lead fields
    And Lead Source
    And Enter the Description Information
    And Other data fields
    And System Information fields
    Then Click the Save button



    Examples:
      | username                            | password     |
      | vedant.jagani@campingworld.com.test | Welcome2019* |