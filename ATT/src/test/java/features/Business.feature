Feature: AT&T business option on AT&T header

  Background:
    Given I am on AT&T homepage

  @smokeTest
  Scenario: Bundles link functionality under AT&T business on header
    And I click on Business
    And I click on bundles
    And I enter "23517 Curie st" on the service address search box
    And I enter "48091" on the zip code field
    When I click on check availability
    And I select internet speed 25
    And I select checkbox for heavy traffic on optional internet ehancement section
    And I select AT&T phone for business under bundle options
    And I enter service user information
      | Service address | 23517 curie st, Warren, MI, 48091 |
      | Business name   | Farhana                           |
      | First name      | Farhana                           |
      | Last name       | Chowdhury                         |
      | email           | fc@gmail.com                      |
      | phone number    | 917362542                         |
    And I click on internet check box
    And I click on submit button
    Then I should see your request has been submitted message

   @smokeTest
  Scenario:  Internet link functionality under AT&T business on header
    And I click on Business
    And I click on Internet
    And I enter "23517 Curie st" on the service address search box
    And I enter "48091" on the zip code field
    When I click on check availability
    And I click on  shop now
    Then I should be able to see all the Internet Deals

  @smokeTest
  Scenario: Voice link functionality under AT&T business on header
    And I click on Business
    And I click on voice
    And I enter "23517 Curie st" on the service address search box
    And I enter "48091" on the zip code field
    When I click on check availability
    Then I should be able to see all voice deals

    @smokeTest
  Scenario: Bundles link functionality under AT&T business on header
    And I click on Business
    And I click on bundles
    And I enter "23517 Curie st" on the service address search box
    And I enter "48091" on the zip code field
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

