Feature: Gift card functionality on Hotel header

  Background:
    Given I am on hotel.com homepage
    And I click on gift cards
    And I click on buy now

  @smokeTest
  Scenario: Mailing gift card functionality under gift card
    And I click on a friend
    And I enter "Alisha Amira" on the friends name search box
    And I enter "Farhana Chowdhury" on my name search box
    And I click on pick a gift card
    And I click on send a  physical gift card
    And I click on how much
    And I click on Fifty for amount
    And I click on add a message
    And I click on where it is going
    And I enter the receiver's mailing information
      | Full name      | Alisha Amira   |
      | Street Address | 23517 Curie st |
      | City           | Warren         |
      | Postal code    | 48091          |
    When I click on shipping
    Then I should see checkout page

  @smokeTest
  Scenario: Gift card purchase functionality under gift card
    And I click on for me
    When I click on pick a gift card
    And I click on send a digital card
    And I click on how much
    And I click on Fifty for amount
    And I click on add to cart
    Then I should see review your card page

  @smokeTest
  Scenario: Personalized gift card functionality under gift card
    And I click on for me
    When I click on pick a gift card
    And I click on send a digital card
    And I click on upload your own photo
    And I check the box for terms and conditions
    And I click on choose photo
    And I click on choose a local file
    And I click on done
    And I click on I like it
    And I click on Hundred for amount
    And I click on add to cart
    Then I should see review your card page

  @smokeTest
  Scenario: Friend Gift card functionality under gift card
    And I click on a friend
    And I enter "Alisha Amira" on the friends name search box
    And I enter "Farhana Chowdhury" on my name search box
    And I click on pick a gift card
    And I click on send a digital card
    And I click on how much
    And I click on Fifty for amount
    And I click on add a message
    And I click on where it is going
    And I enter "Alisha@gmail.com" on the email web edit field
    When I click on add to cart
    Then I should see review your card page

  @smokeTest
  Scenario: Mailing gift card functionality under gift card
    Given I am on hotel.com homepage
    And I click on gift cards
    And I click on buy now
    And I click on a friend
    And I enter "Alisha Amira" on the friends name search box
    And I enter "Farhana Chowdhury" on my name search box
    And I click on pick a gift card
    And I click on send a  physical gift card
    And I click on how much
    And I click on Fifty for amount
    And I click on add a message
    And I click on where it is going
    And I enter the receiver's mailing information
      | Full name      | Alisha Amira   |
      | Street Address | 23517 Curie st |
      | City           | Warren         |
      | Postal code    | 48091          |
    When I click on shipping
    Then I should see checkout page




