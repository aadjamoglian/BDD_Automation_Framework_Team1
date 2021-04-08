Feature: Things to do functionality on Hotel header

  @smokeTest
  Scenario: Things to do search box functionality test
    Given I am on hotel.com homepage
    And I click on things to do
    And I enter "Miami" on things to do search box
    And I click on From Calender
    And I select april 23rd from the  Calender
    And I click on To calender
    And I select April 24th from the calender
    When I click on Search
    Then I should be able to see all the things to do in Miami