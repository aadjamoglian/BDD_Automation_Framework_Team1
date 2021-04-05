Feature: Medicare Check Functionalities

  Background:
    Given I am on Cigna homePage
    And I hover on Employers and Brokers

  @smokeTest
  Scenario: Plans and Services check
    And I click on Plans and Services
    When I click Medical
    And I verify "Medical Plans | Cigna" in page title

  @smokeTest
  Scenario: Who We Serve check
    And I click on Who We Serve
    When I click Small Employers (51-499)
    And I verify "Health Insurance Plans for Small Business (51-499) | Cigna" in page title

  @smokeTest
  Scenario: Why Signa check
    And I click on Why Signa
    When I click Why Cigna Overview
    And I verify "Why Cigna | Cigna" in page title

  @smokeTest
  Scenario: Industry Insights check
    And I click on Industry Insights
    When I click Workplace Wellness
    And I verify "Workplace Wellness Information and News | Cigna" in page title

  @smokeTest
  Scenario: Become a Broker check
    And I click on Become a Broker
    When I click Become a Broker Overview
    And I verify "Become a Cigna Broker or Consultant | Cigna" in page title