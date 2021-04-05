Feature: Medicare Check Functionalities

  Background:
    Given I am on Cigna homePage
    And I hover on Medicare

  @smokeTest
  Scenario: Medicare Coverage Options check
    And I click on Medicare Coverage Options
    When I click Shop Medicare Advantage Plans
    And I verify "Medicare Advantage Plans (Part C) | Cigna Medicare" in page title

  @smokeTest
  Scenario: Enrollment and Eligibility check
    And I click on Enrollment and Eligibility
    When I click Medicare Advantage Enrollment and Eligibility
    And I verify "Medicare Advantage (Part C) Enrollment and Eligibility | Cigna" in page title

  @smokeTest
  Scenario: Understanding Medicare check
    And I click on Understanding Medicare
    When I click Choosing a Medicare Plan
    And I verify "Choosing a Medicare Plan | Cigna Medicare" in page title

  @smokeTest
  Scenario: Member Resources and Services check
    And I click on Member Resources and Services
    When I click Customer Forms
    And I verify "Customer Forms | Cigna" in page title

  @smokeTest
  Scenario: Healthy Aging check
    And I click on Healthy Aging
    When I click Arthritis Symptoms and Treatment
    And I verify "Arthritis Symptoms and Treatment | Cigna Healthy Aging" in page title