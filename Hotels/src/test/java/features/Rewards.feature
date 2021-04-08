Feature: Hotel.com Reward Functionality

  @smokeTest
  Scenario: Join membership functionality under Rewards
    Given I am on hotel.com homepage
    And I click on Hotels.com Rewards
    When I click on join now
    Then I should see create account page

