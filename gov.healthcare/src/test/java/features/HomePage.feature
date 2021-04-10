Feature: HealthCare.com  Product search

  @smokeTest
  Scenario: Explore product on HealthCare.Com Organization
    Given I am on HealthCare.Com Website
    Then I hover on my Mouse On Health Insurance
    When The Mouse Hover Then Click on Get Short Time Insurance
   #Then Verify "How long do you want your coverage to last?" Message
    Then I Click The radio Button less than One year coverage
    Then I click Next
    And I select Female Button
    Then I click Next again
    Then I select for no I do not Radio Button In Tabacco Page
    Then I click Next Button
    Then I select The date Of Birth
    And I click Next Button again
    Then I Enter My Income
    Then I enter again Next Button
    Then Click The Radio Button yes Additional Family
    Then Click next Button
    Then verify "Who are you looking to insure" Text
    Then I send the Email Address
    Then Click the next Box To go the Next Page
    And Verify A text "Your Progress:" In the page
    Then I add my First Name
    And Last name
    Then I give my Email
    And My street Address
    Then I add Also my Phone Number


