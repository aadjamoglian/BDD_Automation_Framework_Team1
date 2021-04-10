Feature: About Us Functionalities

#  Background:
#    Given I am on Cigna homePage
#    And I hover on About Us

#  @smokeTest
#  Scenario: Company Profile check
#    And I click on Company Profile
#    When I click Leadership Team
#    And I verify "Cigna Executives and Management Team | Cigna" in page title
  Background:
    Given I am on Cigna homePage
    And I hover on About Us

  @Test
  Scenario: Company Profile check
  And I click on Company Profile
  When I click Leadership Team
  And I verify "Cigna Executives and Management Team | Cigna" in page title


#
#  @smokeTest
#  Scenario: Newsroom check
#    And I click on Newsroom
#    When I click Studies and Reports
#    And I verify "Studies and Reports | Cigna Newsroom" in page title
#
#  @smokeTest
#  Scenario: Corporate Responsibility check
#    And I click on Corporate Responsibility
#    When I click Cigna in the Community
#    And I verify "Cigna in the Community | Cigna Corporate Responsibility" in page title
#
#  @smokeTest
#  Scenario:Supplier Community check
#    And I click on Supplier Community
#    When I click Ariba
#    And I verify "Ariba Information | Cigna" in page title

