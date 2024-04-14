Feature: Mouse and Keyboard action
@BrowserInitialization
  Scenario: check mouse and keyboard actions in orange HRM
    Given I am on the Orange HRMs website
    When I enters valid username "<username>" and password "<password>"
    And I clicked the login button
    And I click check possible action class functionalities
    Then I should successfully verified the functionality
@logout     
    
    Examples:
    |username|password|
    |Admin|admin123|