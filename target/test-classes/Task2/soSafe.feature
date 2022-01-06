#language: en

Feature: User can request demo and Admin can edit/ delete and add user's data

 # The first Test case
  Scenario: End user request the e-learning demo
    Given Open Chrome browser and search the SoSafe web page
    When User clicks on the Demo navigation button
    And User sees E-learning, Phishing and Analytics demo icons
    And User clicks E-learning demo icon
    And User sees E-learning demo request content is being displayed
    And User clicks the E-learning demo button
    And User fills data to form
    Then User sees confirmation message
    Then Browser close itself after case