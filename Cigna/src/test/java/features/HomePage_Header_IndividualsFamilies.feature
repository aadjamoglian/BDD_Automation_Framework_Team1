Feature: Individuals and Families Check Functionalities

  Background:
    Given I am on Cigna homePage
    And I hover on individuals and families

  @smokeTest
  Scenario: plan and service check
    And I click on plan and service
    When I click medicare
    And I verify "Cigna Medicare Insurance | Cigna" in page title

  @smokeTest
  Scenario: understanding insurance
    And I click on understanding insurance
    When I click Full Coverage Dental Insurance
    And I verify "Full Coverage Dental Insurance | Cigna" in page title

  @smokeTest
  Scenario: Member Resources
    And I click on Member Resources
    When I click Home Delivery Pharmacy
    And I verify "Home Delivery Pharmacy | Cigna" in page title

  @smokeTest
  Scenario: Health and Wellness
    And I click on Health and Wellness
    When I click Dental Health
    And I verify "Resources: Dental Care and Health | Cigna" in page title