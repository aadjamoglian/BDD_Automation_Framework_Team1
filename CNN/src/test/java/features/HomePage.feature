Feature: SearchBox Functionalities

  @test
  Scenario: CNN searchBox functionality check with valid product
    Given I am on CNN homePage
    And  I click on search place
    And I enter "Asian" in searchBox
    When I click on search button
    Then I should see asian news is properly appearing
    But I should not see European news is appeared
    And I verify CNN Official Site | CNN - Breaking News, Latest News and Videos in page title

#    @test2
#    Scenario: CNN TV Show functionality
#      When I click on TV
#      Then I watch CNN news

#Feature: Check Cnn login feature
#
#  @test1 #using scenario outline
#  Scenario Outline: Verify the Sign in feature with random usernames and passwords
#    Given I am on Cnn home page
#    And I click on user icon in the main nav bar
#    And I enter email "<email>" in the email web edit field
#    And I enter password "<password>" in the password web edit field
#    When I click On Login in
#    Then I should see an error message appears on the screen
#
#    Examples:
#      | email             | password         |
#      | invalid@email.com | wrongPassword!@# |
#      | trial@email.com   | invalidpassword  |

  @test #using hashmap
  Scenario:  Verify the Sign in using invalid entries
    Given I am on CNN homePage
    And I click on user icon in the main navigation bar
    And I enter user details as
      | email             | password         |
      | trial@email.com   | invalidpassword  |
      | invalid@email.com | wrongPassword!@# |

    When I click On Login in
    Then I should see an error message appears on the screen

#  @test3
#  Scenario: Verify california elections results map under politics is displaying biden as the winner
#    Given I am on CNN homePage
#    And I click on Politics in the navbar
#    And I click on US Elections in the politics page
#    And I scroll down the page
#    And I hover over california's map
#    When I click on the map
#    Then I should see "Biden" as winner of the state of california

  @test
  Scenario: Verify that user is able to search for news by relevance
    Given I am on CNN homePage
    And I click on search icon in the main navbar
    And I search for "Coronavirus"
    And I click on US radio button
    And I click on plus icon in the sub navigation bar to extend the dropdown
    When I click on Relevance from the dropdown
    Then I should see all the news related to "Coronavirus" displayed on the screen

  @test
  Scenario: Verify that user is able to search for local weather
    Given I am on CNN homePage
    And I click on HAMBURGER_MENU in the navbar
    And I scroll down and click on WEATHER LINK
    And I enter "LA,CA" in the search box
    When I click on Get ForeCast
    Then I should see all "Los Angeles, California" displayed as current selected location on the page

  @test
  Scenario: Verify that user is able to access US link from the main navbar
    Given I am on CNN homePage
    When I click on US text link in the navbar items
    Then I should see "US News – Top national stories and latest headlines - CNN" appears as current page title

  @test
  Scenario: Verify that user is able to visit World news page from the main navbar
    Given I am on CNN homePage
    When I click on World in the navbar items
    Then I should see "World news – breaking news, videos and headlines - CNN" appears as current page title

  @test
  Scenario: Verify that user is able to access Health news page from the main navbar
    Given I am on CNN homePage
    When I click on Health text link in the navbar items
    Then I should see "Health News - CNN" appears as current page title

  @test
  Scenario: Verify that user is able to visit Entertainment page from the main navbar
    Given I am on CNN homePage
    When I click on Entertainment link in the navbar items
    Then I should see "Entertainment News - Celebrities, Movies, TV, Music - CNN" appears as current page title

  @test
  Scenario: Verify that user is able to access Style news page from the main navbar
    Given I am on CNN homePage
    When I click on Style text link in the navbar items
    Then I should see "CNN Style - Fashion, beauty, design, art, architecture and luxury" appears as current page title

  @test
  Scenario: Verify that user is able to visit Travel webpage from the main navbar
    Given I am on CNN homePage
    When I click on Travel link in the navbar items
    Then I should see "CNN Travel | Global Destinations, Tips & Video" appears as current page title

  @test
  Scenario: Verify that user is able to access Sports section from the main navbar
    Given I am on CNN homePage
    When I click on Sports in the navbar items
    Then I should see "Bleacher Report | Sports. Highlights. News. Now." appears as current page title

  @test
  Scenario: Verify that user is able to visit Videos page in the main navbar
    Given I am on CNN homePage
    When I click on Video in the navbar items
    Then I should see "Video News - CNN" appears as current page title

  @test
  Scenario: Verify that user is able to watch live stream
    Given I am on CNN homePage
    And I click LIVE TV
    When I click on play icon
    Then I should be able to watch live content

  @test
  Scenario: Verify that user is able to switch to international edition
    Given I am on CNN homePage
    And I click on Edition dropdown from the navbar items
    When I click on International from the dropdown
    Then I should see "CNN International - Breaking News, US News, World News and Video" appears as current page title

  @test
  Scenario: Verify that user is able to change temperature
    Given I am on CNN homePage
    And I click on HAMBURGER_MENU in the navbar
    And I scroll down and click on WEATHER LINK
    And I enter "LA,CA" in the search box
    And I click on Get ForeCast
    When I click on °C to change temperature to celsius
    Then I should be able to see temperature changed to celsius in my screen

 @test
  Scenario: Verify that user is able to visit cnn facebook Page
    Given I am on CNN homePage
    And I click on HAMBURGER_MENU in the navbar
    And I scroll down to the footer
    When I click on facebook icon in the footer
    Then I should be able to see "CNN - Home | Facebook" appears as current page title

  @test
  Scenario: Verify that user is able to filter dropdown menu under market page
    Given I am on CNN homePage
    And I click on BUSINESS in the navbar
    And I See all link under Markets text link
    And I click on most popular stocks
    When I select "3 month" from the dropdown under Quote in the Macy's Inc Container
    Then I should be able to see the graph changed to show "3 month" market change

 @test
  Scenario: Verify that user is able to hover over elements from the NFL collapsible menu
    Given I am on CNN homePage
    And I click on Sports in the navbar items
    When I hover over the NFL link
    Then I should be able to hover over all the links under the collapsible menu

