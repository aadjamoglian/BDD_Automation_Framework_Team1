Feature: Progressive HomePage Header

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am on progressive homePage
    When I click on Explore Products

  @SmokeTest
  Scenario: Progressive Explore Products Links check
    And I click on Condo


  @SmokeTest
  Scenario: Progressive Homeowners Links check
    And I click on Homeowners

  @SmokeTest
  Scenario: Progressive Mobile Home Links check
    And I click on Mobile Home

  @SmokeTest
  Scenario: Progressive Personal Loans Links check
    And I click on Personal Loans

  @SmokeTest
  Scenario: Progressive Business Insurance Links check
    And I click on Business Insurance

  @SmokeTest
  Scenario: Progressive Life Links check
    And I click on Life




