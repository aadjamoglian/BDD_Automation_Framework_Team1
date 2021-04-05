Feature: Health Care Providers Functionalities

  Background:
    Given I am on Cigna homePage
    And I hover on Health Care Providers

  @smokeTest
  Scenario: Credentialing check
    And I click on Credentialing
    When I click Medical Credentialing
    And I verify "Cigna Medical Network Credentialing | Cigna" in page title

  @smokeTest
  Scenario: Coverage and Claims check
    And I click on Coverage and Claims
    When I click Claims
    And I verify "How to Submit a Claim | Cigna" in page title

  @smokeTest
  Scenario: Pharmacy check
    And I click on Pharmacy check
    When I click Formulary Drug Lists
    And I verify "Formulary Drug Lists | Cigna" in page title

  @smokeTest
  Scenario:Provider Resources check
    And I click on Provider Resources
    When I click The Body and Mind Connection
    And I verify "Emotional Health and Resilience for Providers and Patients | Cigna" in page title

