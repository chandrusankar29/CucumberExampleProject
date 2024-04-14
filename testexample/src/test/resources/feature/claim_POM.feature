Feature: Claim creation
@BrowserInitialization
  Scenario: Verify the claim creation section
    Given I am on the Orange HRM website POM
    When I enter valid username "<username>" and password "<password>" POM
    And I click the login button POM
    And I clicked claim section and clicked assign claim
    And enter details and create claim 
    Then Submit the claim form
@logout

    
    Examples:
    |username|password|
    |Admin|admin123|