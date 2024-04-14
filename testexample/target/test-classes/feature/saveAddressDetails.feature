Feature: Edit address and save funtionality
@BrowserInitialization
  Scenario: Logged in user able to edit saved address and save
    Given I am on the Orange HRMs website
    When I logged in with valid username "<username>" and password "<password>"
    And I clicked my info section
    And I clicked Contact Details
    And i enter address details an cliked Save button
    Then I should see success message
@logout  
     Examples:
    |username|password|
    |Admin|admin123|
    
    
