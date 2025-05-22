Feature: Login and Authentication

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User logs in with email "vinitakumawat6350@gmail.com" and password "123456789"
    Then User should be redirected to the notes page

