Feature: login page functionality
  Scenario: validate login with valid username and valid password
    Given  user is on free crm login page
    And user enter username in username textbox
    And user enter password in password textbox
    When user click on login button
    Then user should be redirected to the homepage