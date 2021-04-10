Feature: Hotels Product search

#  @smokeTest
#  Scenario: Explore product on Progressive website
#    Given I am on the Progressive Homepage
#    When I click on Explore product
#    Then I should see "Vehicle" product
#    And I verify "Explore Products" title is present on that page.
  @smokeTest
  Scenario: Hotels deals finder
    Given I am on the Hotels.com Home Page
    When I click on the Deals
    Then I should see "Hotel Deals Finder"
    Then I Enter LasVegas
    Then I select LasVegas from the dropdown
    Then I click on check in calendar button and select a date
    Then I click on check out calendarbutton and select a date
    Then I select a  rooms number
    Then I select number of adult
    Then  I select number of children
    Then click on show deals
    Then I should see "Las Vegas, NV, United States of America (LAS-McCarran Intl.)" appears on the page


  @smokeTest1
    Scenario: Thinks to do
      Given I am on the Hotels.com Home Page
      When I click on the Thinks to do button
      And I should see "Search Things To Do" text
      Then I search destination and enter
      Then I click From Button to select the date
      Then I click  to button to select the date
      Then I select search button
      And I verify "Recommendations" text will appear on the page





