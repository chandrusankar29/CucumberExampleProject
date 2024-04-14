Feature: PIM User adding
@BrowserInitialization
  Scenario: PIM user add
    Given I am on the Orange HRM website POM
    When I enter valid username "<username>" and password "<password>" POM method
    And I click the login button POM method
    And I clicked the PIM section method
    And Clicked Add button and started creating User firstname "<firstName>" and middlename "<middleName>" and lastname "<lastName>"
    Then Saved the user "<textMessage>"
 @logout   
    
    Examples:
    |username|password|firstName|middleName|lastName|textMessage|
    |Admin|admin123|chandru123|Sankar122|Shanmugam233|Successfully Saved|