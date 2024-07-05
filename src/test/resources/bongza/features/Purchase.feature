Feature: Purchase Item

  Scenario Outline: Login to site and purchase an item
    Given User logins to site with "<username>" and "<password>"
    When they order items
    And Places an order
    And capture the checkout information "<firstname>" and "<lastname>" and "<zipcode>"
    And Completes the order
    Then the order should be processed


    Examples:
    |username     |password    |firstname|lastname|zipcode|
    |standard_user|secret_sauce|testme   |user    |2169   |