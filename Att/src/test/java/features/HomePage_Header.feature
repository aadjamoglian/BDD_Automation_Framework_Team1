Feature: ATT HomePage Header

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am on AT&T homePage
    When I click on menu bar

  @Test1
  Scenario: Deals & discounts Functionality check
    And I click on Deals & discounts
    When I click Deals
    And I verify "AT&T Deals on Phones, Wireless Plans, Internet & TV Services" page title

  @Test2
  Scenario: Deal should be att header
    When I click Deals
    And I verify "AT&T Deals on Phones, Wireless Plans, Internet & TV Services" page title

  @Test3
  Scenario: Best seller page should have See more Best Sellers in Toys & Games option
    And I click on See more Best Sellers in Toys & Games
    Then I verify Best Sellers in Toys & Games is exist

  @Test4
  Scenario: Amazon SearchBox Functionality check with valid credential
    And I enter "Hand Sanitizer" in searchBox
    When I click on search Button
    Then I verify "\"Hand Sanitizer\"" is appear properly
    And I verify page title as Hand Sanitizer




