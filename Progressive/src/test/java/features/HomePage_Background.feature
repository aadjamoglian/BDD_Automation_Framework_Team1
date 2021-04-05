Feature: Progressive HomePage Header

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on progressive homePage

  @smokeTest
  Scenario: Progressive searchBox functionality check
    And I click on Explore Products
    And I click ATV UTV
    Then I verify "Low-cost ATV Insurance from the #1 Motorcycle Insurer | Progressive" in product title

  @smokeTest
  Scenario: Progressive Claims menu functionality check
    And I click on Claims Menu
    And I click Claims Overview
    When I click on Report Button
    Then I verify "Progressive Online Servicing" in product title

  @smokeTest
  Scenario: Progressive About Us menu functionality check
    And I click on About Us Menu
    And I click Local Agents
#    And I click Auto
##    And I select option
#    And I enter zip code in auto
#    When I click on Agent Button
    Then I verify "Insurance Agents And Brokers in California | Progressive Agent" in product title

  @smokeTest
  Scenario: Progressive Answers menu functionality check
    And I click on Answers Menu
    And I click Car insurance deductibles explained
    Then I verify "How Do Car Insurance Deductibles Work? | Progressive" in product title


  @smokeTest
  Scenario: Progressive Answers menu functionality check
    And I click on Answers Menu
    And I click Car insurance deductibles explained
    Then I verify "How Do Car Insurance Deductibles Work? | Progressive" in product title

  @smokeTest
  Scenario: Progressive Auto Popular Box functionality check
    And I click on Auto Popular Box
    Then I verify "Top-Rated Insurance Company for Auto & More | Progressive" in product title

  @smokeTest
  Scenario: Progressive Bundle Save functionality check
    And I click on Bundle Save
    Then I verify "Top-Rated Insurance Company for Auto & More | Progressive" in product title

  @smokeTest
  Scenario: Progressive Property functionality check
    And I click on Property
    Then I verify "Top-Rated Insurance Company for Auto & More | Progressive" in product title

  @smokeTest
  Scenario: Progressive Login click check
    And I click on Login
    Then I verify "Progressive Online Servicing" in product title

  @smokeTest
  Scenario: Progressive Find an agent check
    And I click on Find an agent
    Then I verify "Benefits of a Local Insurance Agent | Progressive Agent" in product title

  @smokeTest
  Scenario: Progressive 1-833-860-1305, Call Us Link check
    And I click on Call Us Link
#    Then I verify "Car Insurance: Free Auto Insurance Quotes | Progressive" in product title

  @smokeTest
  Scenario: Progressive Auto Insurance Link check
    And I click on Auto Insurance Link
    Then I verify "Car Insurance: Free Auto Insurance Quotes | Progressive" in product title
