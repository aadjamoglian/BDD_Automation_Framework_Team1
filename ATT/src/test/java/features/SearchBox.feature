Feature: AT&T search box functionality

#  @smokeTest
#  Scenario Outline: AT&T search box functionality check with valid product
#    Given I am on AT&T homepage
#    And I enter "<productName>" in search box.
#    When I click on search button
#    Then I should see "<ExpectedProduct>" is appearing
#    And I verify "<verifyTitle>" in product title.
#
#    Examples:
#      | productName | ExpectedProduct                     | verifyTitle                         |
#      | iphone 12   | Results for iphone 12 - AT&T Search | Results for iphone 12 - AT&T Search |
#      | iphone 11   | Results for iphone 11 - AT&T Search | Results for iphone 11 - AT&T Search |
#      | iphone X    | Results for iphone X - AT&T Search  | Results for iphone X - AT&T Search  |