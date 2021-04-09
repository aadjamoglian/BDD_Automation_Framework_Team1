Feature: Progressive homepage functionality

  @smokeTest
  Scenario: Claims over view functionality under claims
    Given I am at progressive home page
    And I click on claims
    And i click on claims over view
    When I click on Auto
    Then I should see repair

  @smokeTest
  Scenario: Explore products functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on ATV
    When I enter zip code "48091"
    Then I should see get a quote

  @smokeTest
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

  @smokeTest
  Scenario: Boat functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on Boat
#    And I click on fishing boat
    When I click see more types
#    Then I should see sail boats

  @smokeTest
  Scenario: MotorCycle functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on motorcycle
    When I click find agent
    Then I should see local insurance agent

  @smokeTest
  Scenario: HomeOwners functionality
    Given I am at progressive home page
    And I click on Explore Products
    And I click on homeOwners
    And I click Compare home insurance quotes
#    When I enter zip code "48092
#    Then I should see get started

  @smokeTest
  Scenario: Auto process claims link functionality under claims
    And I click on claims
    When  I click on Auto process claims
    Then I should be able to see the auto claims page

  @smokeTest
  Scenario: Roadside assistance functionality under claims
    And I click on claims
    When  I click on roadside assistance
    And I click on file a claim through progressive app
    Then I should take me to the download page

  @smokeTest
  Scenario: Catastrophe claim functionality under claims
    And I click on claims
    When  I click on Catastrophe
    And I click on login
    Then I should take me to the login page


  @smokeTest
  Scenario: About us  functionality under explore products
    And I click on about us
    When  I click on corporate responsibility
    Then I should be able to see the corporate responsibility page

  @smokeTest
  Scenario: Investors link  functionality under about us
    And I click on about us
    When  I click on Investors
    Then I should be able to see all the messages from the investors

  @smokeTest
  Scenario: Career link  functionality under about us
    And I click on about us
    And I click on career
    When  I click on Find a Career
    Then I should be able to see all the job openings

  @smokeTest
  Scenario: Local Agent  functionality under about us
    And I click on about us
    And I click on Local agent
    And I enter "48091" on the zip code search box
    When I click on find an agent
    Then I should be able to see all the local agents lists

  @smokeTest
  Scenario: Newsroom link  functionality under about us
    And I click on about us
    When I click on newsroom
    Then It should navigate me to the newsroom page

  @smokeTest
  Scenario: Mobile home functionality under explore products
    And I click on mobile homes
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see the start my quote forms

  @smokeTest
  Scenario: Commercial Auto functionality under explore products
    And I click on commercial Auto
    And I enter "48091" on zipcode search bar
    When I click Get  quote
    Then I should be able to see All the commercial Auto Lists

  @smokeTest
  Scenario: Workers compensation functionality under explore products
    And I click on workers compensation
    And I enter "48091" on zipcode search bar
    When I click Get  quote
    And I select workers compensation
    And I click on continue
    Then I should be able to see what do you do homepage

  @smokeTest
  Scenario: Professional Liability functionality under explore products
    And I click on professional liability
    And I enter "48091" on zipcode search bar
    When I click Get  quote
    And I select professional liability
    And I click on continue
    Then I should be able to see what do you do homepage

  @smokeTest
  Scenario: Business Owner's policy functionality under explore products
    And I click on business owners policy
    And I enter "48091" on zipcode search bar
    When I click Get  quote
    Then I should be able to get started page

  @smokeTest
  Scenario: Business insurance policy functionality under explore products
    And I click on business insurance
    And I enter "48091" on zipcode search bar
    When I click Get  quote
    Then I should be able to see get started page

  @smokeTest
  Scenario: Snowmobile insurance functionality under explore products
    And I click on snowmobile
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see the drivers information form

  @smokeTest
  Scenario: Boat insurance functionality under explore products
    And I click on Boat
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see the driver information form

  @smokeTest
  Scenario: Classic Car functionality under explore products
    And I click on Classic car
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see the driver info form

  @smokeTest
  Scenario: Golf Car functionality under explore products
    And I click on Golf car
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see  driver info form

  @smokeTest
  Scenario: Trailer functionality under explore products
    And I click on Trailer
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see all the Trailer lists

  @smokeTest
  Scenario: Segway link functionality under explore products
    And I click on Segway
    And I enter "48091" on the zipcode search bar
    When I click on Get a quote
    Then I should be able to see drivers info form

  @smokeTest
  Scenario: Auto and property link functionality under explore products
    And I click on Auto and property
    And I enter "48091" on the  bundle zipcode search bar
    When I click on Get a quote
    Then I should be able to see drivers inf. form

  @smokeTest
  Scenario: Home Security functionality under explore products
    And I click on home security
    When I click on buy online
    And I click on house
    And I click on small
    And I click on two doors
    Then I should be able to see submit email page

  @smokeTest
  Scenario: PWC link functionality under explore products
    And I click on PWC
    And I enter "48091" on the PWC insurance zipcode search bar
    When I click on Get a quotes
    Then I should be able to see drivers info forms






