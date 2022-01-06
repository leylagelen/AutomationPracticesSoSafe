#language: en

Feature: As a User I can Search a Dress and I can Buy it

 # The first Test case
  Scenario: User navigate the website using the menu links
    Given Open Chrome browser and search the webpage
    When User clicks Women tab
    And User clicks Dresses tab
    And User clicks T-shirts tab
    Then Browser close itself

  # The Second Test case
  Scenario: User navigate the website using the menu links
    Given Open Chrome browser and search the webpage
    When User clicks Search area and enters products name
    Then Browser close itself

  # The Third Test case
  Scenario: User buys product
    Given Open Chrome browser and opens product url
    When User select product and adds to my cart
    And User clicks Proceed to checkout button on popup
    And User clicks Proceed to checkout button on my cart
    And User enter password and email and clicks sign in button
    And User clicks Proceed to checkout button on address screen
    And User clicks Terms of service and Proceed to checkout button
    And User clicks Pay by Check button
    And User clicks I confirm my order button
    Then Second Browser close itself







