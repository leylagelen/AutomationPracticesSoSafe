#language: en

Feature: As a User I can Search a Dress and I can Buy it

 # The first Test case
  Scenario: User navigate the website using the menu links
    Given Open Chrome browser and search the webpage
    When User clicks Women tab
    Then User sees products under Women tab's
    When User clicks Dresses tab
    Then User sees products under Dresses tab's
    When User clicks T-shirts tab
    Then User sees products under T-shirts tab's
    Then Browser close itself

  # The Second Test case
  Scenario: User wants to be able to search for dresses by type
    Given Open Chrome browser and search the webpage
    When User clicks Search area and enters products name
    Then User sees product
    And Browser close itself

  # The Third Test case
  Scenario: User buys product
    Given Open Chrome browser and opens product url
    When User selects product and adds to my cart
    And User clicks Proceed to checkout button on popup
    And User clicks Proceed to checkout button on my cart
    And User enter password and email and clicks sign in button
    And User clicks Proceed to checkout button on address screen
    And User clicks Terms of service and Proceed to checkout button
    And User clicks Pay by Check button
    And User clicks I confirm my order button
    Then User sees successfully buy a product
    Then Second Browser close itself







