Feature: Learn Data Tables

  Background:
  #  Given I am on the Progressive Homepage


@anindya1

  Scenario: Get a code from life insurance
  Given I am on the Progressive Homepage
    When I click on life product link
    Then I should see "Select type of life insurance"
  Then I enter user Zipcode
  |    ZipCode       |
  |     19342        |

  Then  I click on get a Quote button
  Then I enter First name
  |       FirstName   |
  |     Happy        |

  Then I enter Last name
    |       LastName   |
    |     Biswas        |

  And I verify the "Tell us about yourself" text on that Page



