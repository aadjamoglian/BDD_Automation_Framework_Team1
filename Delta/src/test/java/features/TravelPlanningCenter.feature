Feature: Delta header functionality

  Background:
    Given I am at delta homepage
    And I click on travel info

  @smokeTest
  Scenario: Travel planning center functionality on delta header
    When I click on travel planning center
    Then I should see Travel Planning Center

  @smokeTest
  Scenario: Safer Travel under Travel info
    And I click on safer travel
    When I click on mask requirement
    Then I should see face masks

  @smokeTest
  Scenario: Airline partner functionality
    And I click on travel info
    And I click on airline partners
    When I click on air france
    Then I should see Air France

  @smokeTest
  Scenario: KLM functionality
    And I click on travel info
    And I click on airline partners
    When I click on KLM
    Then I should see KLM

  @smokeTest
  Scenario: Virgin Atlantic functionality
    And I click on travel info
    And I click on airline partners
    When I click on virgin atlantic
    Then I should see Virgin Atlantic

  @smokeTest
  Scenario: China Eastern functionality
    And I click on travel info
    And I click on airline partners
    When I click on China Eastern
    Then I should see China Eastern

  @smokeTest
  Scenario: Korean Air functionality
    And I click on travel info
    And I click on airline partners
    When I click on Korean Air
    Then I should see Korean Air

  @smokeTest
  Scenario: Virgin Australia functionality
    And I click on travel info
    And I click on airline partners
    When I click on Virgin Australia
    Then I should see Virgin Australia

  @smokeTest
  Scenario: Aero Mexico functionality
    And I click on travel info
    And I click on airline partners
    When I click on Aero Mexico
    Then I should see Aero Mexico

  @smokeTest
  Scenario: Latam functionality
    And I click on travel info
    And I click on airline partners
    When I click on latam
    Then I should see Latam

  @smokeTest
  Scenario: West jet functionality
    And I click on travel info
    And I click on airline partners
    When I click on West jet
    Then I should se West jet










