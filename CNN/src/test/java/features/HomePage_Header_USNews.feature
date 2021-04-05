Feature: US News Functionalities

  Background:
    Given I am on CNN homePage
    And I click on US news

  @smokeTest
  Scenario: CNN US news check
    When I click Crime and Justic
    And I verify "Crime + Justice - CNN" in page title



