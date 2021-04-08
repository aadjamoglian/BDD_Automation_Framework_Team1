Feature: Hotels.com header Functionality

  @smokeTest
  Scenario: Hotel Deals finder on Hotels.com header
    Given I am on hotel.com homepage
    And I click on deals
    And I enter "Miami" on the search Bar
    And I select April 20th for check in date
    And I select April 25th for checkout date
##    And I select 3 people from the Adult drop down
##    And I select 2 rooms from the Rooms drop down
##    When I click on check availability
##    Then I should be able see all the deals.

  @smokeTest
  Scenario: Flight packages functionality on hotels header
    Given I am on hotel.com homepage
    And I click Packages & Flights
    And I click on flight & Hotel
    And I enter "Detroit" on the flying from search box
    And I enter "Miami" on destination search box
    And I select april 20th from the destination calender
    And I select april 23rd from the returning Calender
    When I click on search button
    Then I should be able to see all the available flights

  @smokeTest
  Scenario: Car rentals functionality on hotels header
  Given I am on hotel.com homepage
    And I click on car rentals
    And I enter "Miami" on the rental car search bar
    And I click on pickup calender
    And I select April 20th from the pickup calender
    And I click on drop-off calender
    And I select April 21st from the drop-off calender
    When I click on search
    Then I should be able to see all the available cars for pickup



