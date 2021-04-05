Feature: Explore Products Functionality check

  @SmokeTest
  Scenario: Progressive Explore Products functionality check
    Given I am on progressive homePage
     And I click on Explore Products
     When I click on Claims
     Then I should see "Top-Rated Insurance Company for Auto & More | Progressive" in page title

  @SmokeTest
  Scenario: Progressive Claims functionality check
    Given I am on progressive homePage
    And I click on Claims Menu
    When I click on About Us
    Then I should see "Top-Rated Insurance Company for Auto & More | Progressive" in page title

  @SmokeTest
  Scenario: Progressive About Us Menu functionality check
    Given I am on progressive homePage
    And I click on About Us Menu
    When I click on Answers
    Then I should see "Top-Rated Insurance Company for Auto & More | Progressive" in page title

  @SmokeTest
  Scenario: Progressive Answers Menu functionality check
    Given I am on progressive homePage
    And I click on Answers Menu
    When I click on See all topics
    Then I should see "Insurance Information & Resources | Progressive" in page title

  @SmokeTest
  Scenario: Progressive Auto functionality check
    Given I am on progressive homePage
    And I click on see30PlusProducts
    And I click autoHome
    Then I should see "Top-Rated Insurance Company for Auto & More | Progressive" in page title

  @SmokeTest
  Scenario: Progressive Find an agent functionality check
    Given I am on progressive homePage
    And I click on Find an agent
#    And I click on product
#    And I enter zip code
#    And I click find agent
#    Then I should see "Insurance Agents And Brokers in California | Progressive Agent" in page title

  @SmokeTest
  Scenario: Progressive Investors Us functionality check
    Given I am on progressive homePage
    And I click on Investors
    Then I should see "Investor Relations | Progressive" in page title

  @SmokeTest
  Scenario: Progressive Contact Us functionality check
    Given I am on progressive homePage
    And I click on Contact Us
    Then I should see "Contact Progressive via Chat, Email, or Phone | Progressive" in page title

  @SmokeTest
  Scenario: Progressive Become a Partner functionality check
    Given I am on progressive homePage
    And I click on Become a Partner
    Then I should see "Become a B2B Partner | Progressive" in page title

  @SmokeTest
  Scenario: Progressive News Room functionality check
    Given I am on progressive homePage
    And I click on News Room
    Then I should see "Recent News Releases & Coverage | Progressive Newsroom" in page title










