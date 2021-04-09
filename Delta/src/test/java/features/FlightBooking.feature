Feature: Book functionality on Delta header

  @smokeTest
  Scenario: Round trip functionality under Book
    Given I am at delta homepage
    And I click on Book
    And I click on From
    And I enter "San Antonio" on from search box
    And I click on To
    And I enter "JFK" on the To search box
    And I click on calender
    And I select April 20th for departure
    And I select  April 23rd for returning
    And I click on done button
    When I click on aero button
    Then I should see all the available flight

    @smokeTest
    Scenario: One way trip functionality
      Given I am at delta homepage
      And I click on Book
      And I click on From
      And I enter "DTW" on from search box
      And I click on To
      And I enter "MCO" on the To search box
      And I select one way
      And I click on calender
      And I select April 20th for departure
      And I click on done button
      When I click on aero button
      Then I should see all the available flight

      @smokeTest
      Scenario: Passenger select option functionality
        Given I am at delta homepage
        And I click on Book
        And I click on From
        And I enter "ATL" on from search box
        And I click on To
        And I enter "Lax" on the To search box
        And I select one way
        And I click on calender
        And I select April 20th for departure
        And I click on done button
        And I select two passengers
        When I click on aero button
        Then I should see all the available flight





