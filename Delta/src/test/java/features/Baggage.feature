Feature: Baggage functionality under Travel info

  @smokeTest
  Scenario: Checked bag fees functionality
    Given I am at delta homepage
    And I click on travel info
    When I click on Baggage
    Then I should see baggage and travel fees

    Scenario: Carry-On baggage functionality
      Given I am at delta homepage
      And I click on travel info
      And I click on Baggage
      When I click on carry on baggage
      Then I should see one carry on baggage

      Scenario: Track checked baggage functionality
        Given I am at delta homepage
        And I click on travel info
        And I click on Baggage
        When I click on Track checked baggage
        Then I should see Bag Information





