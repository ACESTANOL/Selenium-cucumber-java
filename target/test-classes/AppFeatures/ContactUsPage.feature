#@tag
Feature: validation of Contact Us Page
  I want to use this template for my feature file

  #TEST CASE 6
  @SOLO
  Scenario: Contact Us Form
    Given User is on Contact Us page
    When Submit message
    Then Success message should be visible
