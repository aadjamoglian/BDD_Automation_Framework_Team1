Feature: Travel info functionality on Delta header

  Background:
    Given I am on Delta HomePage

    @smokeTest
  Scenario: Baggage functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on checked baggage fees
    Then I should be able to see the baggage prices

  @smokeTest
  Scenario: Carry-on-baggage functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on carry on baggage
    Then I should be able to see the carry on baggage info page

  @smokeTest
  Scenario: Track checked baggage functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on track checked baggage
    And I click on Twenty minute bag guarantee
    Then I should see bags on time form

  @smokeTest
  Scenario: Special item functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on special item
    Then I should be able to see special item info page

  @smokeTest
  Scenario: Excess and overweight baggage functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on excess and overweight baggage
    And I click on excess baggage guidelines
    Then I should be able to see excess baggage guideline info page

  @smokeTest
  Scenario: Prohibited and restricted item functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on prohibited and restricted items
    And I click on Tobacco, E-Cigarettes or Marijuana
    Then I should see travel guidelines for Tobacco, E-Cigarettes or Marijuana

  @smokeTest
  Scenario: Delayed, Lost or Damaged bags functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on Delayed, Lost or Damaged bags
    And I click on submit a claim link
    Then I should be able to see baggage claim form

  @smokeTest
  Scenario: Embargoes & Limitations functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on Embargoes & Limitations
    Then I should be able to see Embargoes & Limitations info page

  @smokeTest
  Scenario: Travel changes functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on travel changes
    Then I should be able to see travel changes fee page

  @smokeTest
  Scenario: Travel services functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on travel services
    Then I should be able to see travel services info page

  @smokeTest
  Scenario: First checked bag free link functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on First checked bag free link
    Then I should be able to see First checked bag frees info page

    @smokeTest
    Scenario: First class flight functionality under travel info
      And I click travel info
      And I click on first class flight
      When I click on book now
      Then I should see all the available first class flight

  @smokeTest
  Scenario: Delta one flight functionality under travel info
    And I click travel info
    And I click on Delta one
    When I click on Delta one book now
    Then I should see the flight booking page

  @smokeTest
  Scenario: Prohibited and restricted item functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on prohibited and restricted items
    And I click on Tobacco, E-Cigarettes or Marijuana
    Then I should see travel guidelines for Tobacco, E-Cigarettes or Marijuana

  @smokeTest
  Scenario: Delayed, Lost or Damaged bags functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on Delayed, Lost or Damaged bags
    And I click on submit a claim link
    Then I should be able to see baggage claim form

  @smokeTest
  Scenario: Track checked baggage functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on track checked baggage
    And I click on Twenty minute bag guarantee
    Then I should see bags on time form

  @smokeTest
  Scenario: Special item functionality under travel info
    And I click travel info
    And I click on baggage
    When I click on special item
    Then I should be able to see special item info page