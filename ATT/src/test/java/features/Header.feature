Feature: AT&T Deals on AT&T header

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
  Scenario: Low cost phones under phones & devices deal
    And I click on wireless
    When I click on phones & devices
    And I click on Low cost phone
    Then I should be able to see all the low cost phones

  @smokeTest
  Scenario: compare devices under low cost phone and devices deals
    And I click on wireless
    And I click on phones & devices
    When I click on Low cost phone
    Then I should be able to compare devices

  @smokeTest
  Scenario: Apple phones under phones & devices deal
    And I click on wireless
    When I click on phones & devices
    And I click on Apple
    Then I should be able to see all the Apple phones

  @smokeTest
  Scenario: Samsung phones under phones & devices deals
    And I click on wireless
    When I click on phones & devices
    And I click on Samsung
    Then I should be able to see all the Samsung phones

  @smokeTest
  Scenario: Store pickup under phones & devices deals
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
  Scenario: Tablet and PC under phones & devices deals
    And I click on wireless
    When I click on phones & devices
    And I click on Tablet and PC
    Then I should be able to see all the Tablets and pcs

  @smokeTest
  Scenario: AT&T & prepaid under Phones & devices deals
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


  @smokeTest
  Scenario: AT&T search box functionality check with valid product
    And I enter "iphone 12" in search box.
    When I click on search button
    Then I should see "iphone 12"" is appearing
    And I verify "Results for iphone 12 - AT&T Search" in product title.


Feature: AT&T business option on AT&T header

  Background:
    Given I am on AT&T homepage

  @smokeTest
  Scenario: Bundles link functionality under AT&T business on header
    And I click on Business
    And I click on bundles
    And I enter "8648 127th st" on the service address search box
    And I enter "11418" on the zip code field
    When I click on check availability
    And I select internet speed 25
    And I select checkbox for heavy traffic on optional internet ehancement section
    And I select AT&T phone for business under bundle options
    And I enter service user information
      | Service address | 8648 127th st, Jamaica, NY, 11418 |
      | Business name   | MS Grocery                        |
      | First name      | Istihaque                         |
      | Last name       | Chowdhury                         |
      | email           | isti@gmail.com                    |
      | phone number    | 562387646                         |
    And I click on internet check box
    And I click on submit button
    Then I should see your request has been submitted message

  @smokeTest
  Scenario:  Internet link functionality under AT&T business on header
    And I click on Business
    And I click on Internet
    And I enter "8648 127th st" on the service address search box
    And I enter "11418" on the zip code field
    When I click on check availability
    And I click on  shop now
    Then I should be able to see all the Internet Deals

  @smokeTest
  Scenario: Voice link functionality under AT&T business on header
    And I click on Business
    And I click on voice
    And I enter "8648 127th st" on the service address search box
    And I enter "11418" on the zip code field
    When I click on check availability
    Then I should be able to see all voice deals

  @smokeTest
  Scenario: Bundles link functionality under AT&T business on header
    And I click on Business
    And I click on bundles
    And I enter "8648 127th st" on the service address search box
    And I enter "11418" on the zip code field
    When I click on check availability
    Then I should be able to see all the bundles

  @smokeTest
  Scenario: Business tools functionality under business
    And I click on Business
    When I click on business tools
    Then I should be able to see the business tools page

  @smokeTest
  Scenario: Business TV functionality under business
    And I click on Business
    When I click on business TV
    And I click on Offices
    Then I should be able to see get free quote page

  @smokeTest
  Scenario: Enterprise business functionality under business
    And I click on Business
    When I click on enterprise business
    And I click on Mobility
    Then I should see unlimited your way page

  @smokeTest
  Scenario: Internet & networking  functionality under enterprise business
    And I click on Business
    And I click on enterprise business
    When I click on internet & networking
    And I click on complete your purchase
    Then I should see the business address form

  @smokeTest
  Scenario: Voice and collaboration  functionality under enterprise business
    And I click on Business
    And I click on enterprise business
    When I click on voice and collaboration
    Then I should see voice and collaboration page

  @smokeTest
  Scenario: Cyber security  functionality under enterprise business
    And I click on Business
    And I click on enterprise business
    When I click on cyber security
    Then I should see cyber security page

  @smokeTest
  Scenario: Content and Entertainment  functionality under enterprise business
    And I click on Business
    And I click on enterprise business
    When I click on Content and Entertainment
    Then I should see Content and Entertainment  page

  @smokeTest
  Scenario: Digital capabilities  functionality under enterprise business
    And I click on Business
    And I click on enterprise business
    When I click on Digital capabilities
    Then I should see Digital capabilities page

  @smokeTest
  Scenario: Prepaid functionality on AT&T header
    And I click on  prepaid
    And I click on prepaid plans
    When I click on  shop now arrow
    Then I should see all the prepaid deals


  @smokeTest
  Scenario: TV functionality in AT&T header
    And I click on  TV
    And I click on Channel Lineup
    When I enter the channel names on the channel search bar
    Then I should be able to see all the channel deals and shop now option