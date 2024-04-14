Feature: Leave Search
@BrowserInitialization
  Scenario: Leave search scenario
    Given I am on the Orange HRMs website
    When Im enters valid username "<username>" and password "<password>"
    And Im clicked the login button
    And check
    Then check checks
  @logout   
    
    Examples:
    |username|password|
    |Admin|admin123|