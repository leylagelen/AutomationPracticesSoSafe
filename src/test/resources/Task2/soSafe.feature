#language: en

Feature: User can request demo and Admin can edit/ delete and add user's data

 # User Story A
  Scenario: End user request the e-learning demo
    Given Open Chrome browser and search the SoSafe web page
    When User clicks on the Demo navigation button
    Then User sees E-learning, Phishing and Analytics demo icons
    When User clicks E-learning demo icon
    Then User sees E-learning demo request content is being displayed
    And User clicks the E-learning demo button
    When User fills data to form
    Then User sees confirmation message
    And Browser close itself after case

  # User Story B
  Scenario: Admin delete all user data at once
    Given User is logged in as administrator
    And Admin opens User Table
    When Admin click Delete All button
    Then Admin sees modal
    When Admin enters admin password to password area and click Weiter button
    Then Admin sees second modal and sees message
    And Admin sees confirmation button
    When Admin clicks Weiter button on second modal
    Then Admin get back to the user table view
    And Admin sees user table is empty
    And Admin sees message about users successfully deleted
    Then Browser close itself after case

  # User Story C
  Scenario: Admin can close modal without deleting all user data at once
    Given User is logged in as administrator
    And Admin opens User Table
    When Admin click Delete All button
    Then Admin sees modal
    When Admin enters admin password to password area and click Abbrechen button
    Then Admin get back to the user table
    And Admin sees all user data is still available
    Then Browser close itself after case

  # User Story D
  Scenario: Admin can edit a single user's data
    Given User is logged in as administrator
    And Admin opens User Table
    When Admin clicks on the Edit button
    Then Admin sees the editing view is displayed
    When Admin change the mail address with valid email address
    And Admin clicks Save button
    Then Admin sees successfully changed message
    And Admin sees edit view is closed and User table is being displayed
    Then Browser close itself