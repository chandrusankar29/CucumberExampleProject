Feature: Login functionality using POM
@BrowserInitialization
  Scenario: User login with valid username and password Using POM
    Given I am on the Orange HRM website POM
    When I enter valid username "<username>" and password "<password>" POM
    And I click the login button POM
    Then I should successfully log in to the application POM
@logout   
    
    Examples:
    |username|password|
    |Admin|admin123|