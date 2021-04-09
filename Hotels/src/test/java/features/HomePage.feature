Feature: Hotels.com header Functionality

  @smokeTest
  Scenario: Hotel Deals finder on Hotels.com header
    Given I am on hotel.com homepage
    And I click on deals
    And I enter "MIA" on the search Bar
    And I select April 20th for check in date
    And I select April 25th for checkout date
    And I select 3 people from the Adult drop down
    And I select 2 rooms from the Rooms drop down
    When I click on check availability
    Then I should be able see all the deals.

  @smokeTest
  Scenario: Flight packages functionality on hotels header
    Given I am on hotel.com homepage
    And I click Packages & Flights
    And I click on flight & Hotel
    And I enter "MIA" on the flying from search box
    And I enter "DTW" on destination search box
    And I select april 20th from the destination calender
    And I select april 23rd from the returning Calender
    When I click on search button
    Then I should be able to see all the available flights

  @smokeTest
  Scenario: Car rentals functionality on hotels header
    Given I am on hotel.com homepage
    And I click on car rentals
    And I enter "MIA" on the rental car search bar
    And I click on pickup calender
    And I select April 20th from the pickup calender
    And I click on drop-off calender
    And I select April 21st from the drop-off calender
    When I click on search
    Then I should be able to see all the available cars for pickup

  @smokeTest
  Scenario: Gift card purchase functionality under gift card
    And I click on for me
    When I click on pick a gift card
    And I click on send a digital card
    And I click on how much
    And I click on Fifty for amount
    And I click on add to cart
    Then I should see review your card page

  @smokeTest
  Scenario: Personalized gift card functionality under gift card
    And I click on for me
    When I click on pick a gift card
    And I click on send a digital card
    And I click on upload your own photo
    And I check the box for terms and conditions
    And I click on choose photo
    And I click on choose a local file
    And I click on done
    And I click on I like it
    And I click on Hundred for amount
    And I click on add to cart
    Then I should see review your card page

  @smokeTest
  Scenario: Friend Gift card functionality under gift card
    And I click on a friend
    And I enter "Jack Cohen" on the friends name search box
    And I enter "Alexa" on my name search box
    And I click on pick a gift card
    And I click on send a digital card
    And I click on how much
    And I click on Fifty for amount
    And I click on add a message
    And I click on where it is going
    And I enter "jack@gmail.com" on the email web edit field
    When I click on add to cart
    Then I should see review your card page

  @smokeTest
  Scenario: Things to do search box functionality test
    Given I am on hotel.com homepage
    And I click on things to do
    And I enter "MIA" on things to do search box
    And I click on From Calender
    And I select april 23rd from the  Calender
    And I click on To calender
    And I select April 24th from the calender
    When I click on Search
    Then I should be able to see all the things to do in Miami

  @smokeTest
  Scenario: Join membership functionality under Rewards
    Given I am on hotel.com homepage
    And I click on Hotels.com Rewards
    When I click on join now
    Then I should see create account page

  @smokeTest
  Scenario: Mailing gift card functionality under gift card
    And I click on a friend
    And I enter "JACK Cohen" on the friends name search box
    And I enter "Alexa" on my name search box
    And I click on pick a gift card
    And I click on send a  physical gift card
    And I click on how much
    And I click on Fifty for amount
    And I click on add a message
    And I click on where it is going
    And I enter the receiver's mailing information
      | Full name      | Jack Cohen  |
      | Street Address | 25 Broadway |
      | City           | Manhattan   |
      | Postal code    | 11102       |
    When I click on shipping
    Then I should see checkout page