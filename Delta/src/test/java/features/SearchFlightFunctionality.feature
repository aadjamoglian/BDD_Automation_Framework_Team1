Feature: Delta search flight functionality

  Background:
    Given I am on Delta HomePage

  @smokeTest
  Scenario: One way flight functionality  on Delta header
    And I click on book
    And I click on From
    And I enter "Miami" on the from box
    And I click on TO
    And I enter "Los angeles" on the To box
    And I select one way from the drop down
    And I select April 30th from  the depart-return calender
    And I select "1 passenger" from the drop down
    When I click on the proceed arrow
    Then I should be able to see all the available flights


  @smokeTest
  Scenario: Round trip flight functionality on Delta header
    And I click on book
    And I click on From
    And I enter "Detroit" on the from box
    And I click on TO
    And I enter "JFK" on the To box
    And I click on depart calender
    And I select April 20th from  the depart calender
    And I select April 23rd from  the return calender
    And I click on done
    When I click on the proceed arrow
    Then I should be able to see all the available flights and times

  @smokeTest
    Scenario: Vacation deal functionality on Delta homepage
    And I click on vacation deals
    And I click on origin
    And I enter "Laguardia" on the origin search box
    And I click on destination
    And I enter "Las Vegas" on the destination search box
    And I click on Depart calender
    And I select April 25th from the depart calender
    And I click on return calender
    And I select April 28th from the return calender
    When I click on search button
    And I drag the price range button from $399 to $600
    Then i should be able to see all the deals from $399 to $600








