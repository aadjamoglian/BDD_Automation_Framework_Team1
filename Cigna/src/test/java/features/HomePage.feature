Feature: SearchBox Functionality Check
  @smokeTest
  Scenario: Cigna searchBox functionality check with valid product
    Given I am on Cigna homePage
    And I enter "Diabetic" in searchBox
    When I click on search button
    Then I should see Diabetic is properly appearing
    But I should not see mobile is appeared
    And I verify Cigna Official Site | Global Health Service Company in page title


#  @pending
#  Scenario: Cigna searchBox functionality check with valid product
#    Given I am on Cigna homePage
#    And I enter Diabetic in searchBox
#    When I click on search button
#    Then I should see Diabetic is properly appearing
#    But I should not see mobile is appeared
#    And I verify Cigna Official Site | Global Health Service Company in page title



