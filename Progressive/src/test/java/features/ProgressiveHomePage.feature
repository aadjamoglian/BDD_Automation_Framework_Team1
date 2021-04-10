Feature: Progressive Product search

 # Background:  Given I am on the Progressive Homepage

@smokeTest
  Scenario: Explore product on Progressive website
  Given I am on the Progressive Homepage
    When I click on Explore product
    Then I should see "Vehicle" product
    And I verify "Explore Products" title is present on that page.

  @smokeTest1
  Scenario: Get a Auto Insurance code from Progressive
    Given I am on the Progressive Homepage
    When  I click on Auto Link
    Then I should see "AUTO" Text
    Then I enter ZipCode
    Then I click on Get a quote link
    Then I verify "Name & Birthdate" on that page

@anindya
    Scenario: Enter Personal Information to get the Auto Code
  Given I am on the Progressive Homepage
  When  I click on Auto Link
  Then I should see "AUTO" Text
  Then I enter ZipCode
  Then I click on Get a quote link
  Then I verify "Name & Birthdate" on that page
  Then I enter First Name
  Then I enter Last Name
  Then I click suffix and select Sr


  @RegressionTest
  Scenario: Login to My Progressive Account
    Given I am on the Progressive Homepage
    When I click on login Button
    Then I should see "Welcome" on that page
    Then I enter user ID
    And  I enter Password
    Then I click on login link

  @RegressionTest1
  Scenario: Enter claim to get the Claim Information
  Given I am on the Progressive Homepage
  When I click on Claim button
  Then I should see  "Claims" Text
  And I click on Claim overview
  Then I verify "Progressive claims" appears on the page

  @RegressionTest2
    Scenario: Review customers Answers
      Given I am on the Progressive Homepage
      When I am click on the Answer button
      Then I will see "Progressive Answers"
      And I click on see all topic button
      Then I click Am i covered
      Then I click how renters insurance cover theft image
      Then i verify "Does renters insurance cover theft?" appears on the page










