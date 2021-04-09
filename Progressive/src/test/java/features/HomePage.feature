Feature: Progressive homepage functionality

  Scenario: Claims over view functionality under claims
    Given I am at progressive home page
    And I click on claims
    And i click on claims over view
    When I click on Auto
    Then I should see repair

  Scenario: Explore products functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on ATV
    When I enter zip code "48091"
    Then I should see get a quote

  Scenario: Auto functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on Auto1
    And I enter zip code1 "48091"
    And I click on get a quote
    And I enter first name "Istihaque"
    And I enter last name "Chowdhury"
    When I enter date of birth "12/21/1991"
    Then I should see mailing address option

  Scenario: Boat functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on Boat
#    And I click on fishing boat
    When I click see more types
#    Then I should see sail boats

  Scenario: MotorCycle functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on motorcycle
    When I click find agent
    Then I should see local insurance agent

  Scenario: HomeOwners functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on homeOwners
    And I click Compare home insurance quotes
#    When I enter zip code "48092
#    Then I should see get started






