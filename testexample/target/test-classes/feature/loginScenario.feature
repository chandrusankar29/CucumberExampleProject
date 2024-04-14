Feature: Login functionality
@BrowserInitialization
  Scenario: User login with valid username and password
    Given I am on the Orange HRMs website
    When I enter valid username "<username>" and password "<password>"
    And I click the login button
    Then I should successfully log in to the application
@logout       
    
    Examples:
    |username|password|
    |Admin|admin123|
 
 @BrowserInitialization   
  Scenario: User login with Invaid username and password
    Given I am on the Orange HRMs website
    When I enter valid username "<username>" and password "<password>"
    And I click the login button
    Then I should not successfully log in to the application
@logout      
    
    Examples:
    |username|password|
    |Admin1|admin1123|
    |admin|aasms|
    
    
