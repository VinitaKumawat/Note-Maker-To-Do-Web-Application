Feature: Create Note

  Scenario: User creates a note with notebook selection
    Given User is on login page
    When User logs in with "vinitakumawat6350@gmail.com" and "123456789"
    And User navigates to Notes
    And User creates a note with title "Selenium" and description "QA test plan and automation scripts for the Note Maker & To-Do web app — covering functional, UI, and responsive testing using Selenium and TestNG." in notebook "Test Notebook"
    Then Note should be created successfully
