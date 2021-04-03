Feature: AT&T homepage header

  Background:
    Given I am on AT&T homepage
    And I click on deals

@smokeTest
  Scenario: Deals in AT&T header
    When I click on wireless
    Then I should be able to see all the wireless items

  @smokeTest
  Scenario: Wireless under Deals in AT&T header
    When I click on wireless
    And I click on explore wireless
    Then I should be able to see all the Explore wireless items

  @smokeTest
  Scenario: Low cost phones under phones & devices
    And I click on wireless
    When I click on phones & devices
    And I click on Low cost phone
    Then I should be able to see all the low cost phones

  @smokeTest
  Scenario: compare devices under low cost phone and devices
    And I click on wireless
    And I click on phones & devices
    When I click on Low cost phone
   Then I should be able to compare devices

  @smokeTest
  Scenario: Apple phones under phones & devices
    And I click on wireless
    When I click on phones & devices
    And I click on Apple
    Then I should be able to see all the Apple phones

  @smokeTest
  Scenario: Samsung phones under phones & devices
    And I click on wireless
    When I click on phones & devices
    And I click on Samsung
    Then I should be able to see all the Samsung phones

  @smokeTest
  Scenario: Store pickup under phones & devices
    And I click on wireless
    And I click on phones & devices
    When I  click on store pick-up
    Then I should be able to see all the available store pick=up items.

  @smokeTest
  Scenario: Phones & devices and under deals
    And I click on wireless
    When I click on phones & devices
    Then I should see all the phones and device deals

  @smokeTest
  Scenario: Tablet and PC under phones & devices
    And I click on wireless
    When I click on phones & devices
    And I click on Tablet and PC
    Then I should be able to see all the Tablets and pcs

  @smokeTest
  Scenario: AT&T & prepaid under Phones & devices
    And I click on wireless
    When I click on phones & devices
    And I click on AT&T & prepaid
    Then I should see all the AT&T & prepaid deals

  @smokeTest
  Scenario: Internet & TV and under deals
    When I click on Internet & TV
    Then I should see all theInternet & TV deals

    @smokeTest
  Scenario: Accessories  under deals
    When I click on Accessories
    Then I should see all the accessories deals

#  @smokeTest
#  Scenario: AT&T menu bar functionality
#    And I click on menu Bar
#    When I click on Internet
#    And I mouse hover on Internet Accessories
###    Then I should see all the internet Accessories product appear