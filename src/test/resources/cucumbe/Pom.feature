
#Sample Feature Definition Template
Feature: To test add tariff plan using pom

 
  Scenario: To verify add tariff plan with valid details using pom
    Given The user is in add tariff plan 
    When The user fill in valid plan details with data
    When The user clicks submit button using pom
    Then The user should see the sucess message

    
