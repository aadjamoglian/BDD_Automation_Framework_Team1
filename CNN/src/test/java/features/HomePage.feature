Feature: SearchBox Functionalities

  @smokeTest
  Scenario: CNN searchBox functionality check with valid product
    Given I am on CNN homePage
    And  I click on search place
    And I enter "Asian" in searchBox
    When I click on search button
    Then I should see asian news is properly appearing
    But I should not see European news is appeared
    And I verify CNN Official Site | CNN - Breaking News, Latest News and Videos in page title
#
#    @test2
#    Scenario: CNN TV Show functionality
#      When I click on TV
#      Then I watch CNN news
