Feature: Delta Product search

  @smokeTest
  Scenario: Delta LogIn
    Given I am On Delta Home Page
    Then I click on Login Button
    When I Click on  Login Button  I should see "Log In To Delta"
    Then I click on user name and send Key
    Then I  click on Password and send the key
    And I Verify "All fields are required" Text

  @smokeTest1
  Scenario: Delta Travel Info
    Given I am On Delta Home Page
    Then Mouse hover in Travel info
    When Mouse hover I select the Baggage and click
    Then I should See "Baggage & Travel Fees"
    Then I click on Track check on baggage
    Then I verify "Check Bag Status"
    And I click The Arrow Button To Know the bag Confarmation num num
    Then I click The confirmation number
    And The Last Name I click


  @smokeTest2
  Scenario: flight status checking
    Given I am On Delta Home Page
    Then I click on from your origin
    And I Type Jfk on the box
    Then From Drop down  I select JFK New York Kennedy, Ny
    Then I click on from your destination
    And I type BHM on the From box
    Then I select BHM Birmingham Alabama
    Then I verify"SEARCH OPTIONS" Text

  @smokeTest3
  Scenario: Flight Status Checking One
    Given I am On Delta Home Page
    Then I am Click on round trip drop down button
    And I select One way
    Then I verify "THE DELTA CUSTOMER EXPERIENCE" on that page


  @smokeTest4
  Scenario: Flight Departure and Return Date
    Given I am On Delta Home Page
    Then Select Departure Locator
    And Select the Departure  Date
    When select the Date click on departure done button
    Then select the Return Locator
    And Select the Return Date
    Then Select the Return Done Button


  @smokeTest5
  Scenario: Select passenger Status
    Given I am On Delta Home Page
    Then I click Passenger DropDown Arrow
    Then Select The Passenger 4
    Then I click The Arrow to go to the next page

  @smokeTest6
  Scenario: Delta LogIn page
    Given I am On Delta Home Page
    Then I click on from your origin
    And I Type Jfk on the box
    Then From Drop down  I select JFK New York Kennedy, Ny
    Then I click on from your destination
    And I type BHM on the From box
    Then I select BHM Birmingham Alabama
    Then I verify"SEARCH OPTIONS" Text
    Then I am Click on round trip drop down button
    And I select One way
    Then I verify "THE DELTA CUSTOMER EXPERIENCE" on that page
    Then Select Departure Locator
    And Select the Departure  Date
    When select the Date click on departure done button
    Then I click Passenger DropDown Arrow
    Then Select The Passenger 4
    Then I click The Arrow to go to the next page
    Then I was verify "Flying Made Simple" Text






