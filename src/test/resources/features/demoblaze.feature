Feature: Tests for demoblaze basic features

  @ValidCredentials
#  Scenario: sign up
#
#    When launch the demoblaze website
#    When User enters username as "tayyeba123" and password as "Anaya2017." and signup


  Scenario Outline: Signup to demo blaze
    When launch the demoblaze website
    When User signup with username and password from excel row number <RowNumber>
    Examples:
      | RowNumber |  |
      | 0         |  |
      | 1         |  |
      | 2         |  |
      | 3         |  |


  Scenario Outline: log in to demo blaze
    When launch the demoblaze website
    When User enters username and password from excel row number <RowNumber>
    Examples:
      | RowNumber |  |
      | 0         |  |
      | 1         |  |
      | 2         |  |
      | 3         |  |

  Scenario: add to cart
      When launch the demoblaze website
      When User enters username as "tayyeba123" and password as "Anaya2017." and login
      Then user click on the product
      Then click on the add to cart button

    Scenario: Place the order
      When launch the demoblaze website
      When User enters username as "tayyeba123" and password as "Anaya2017." and login
      Then user click on the product
      Then click on the add to cart button
      Then click on cart link
      Then click on the purchase button
      Then enter name as a "Tayyeba" and country as a "united kingdom " and city as "London"
      Then enter credit card details as a "1234567891234567" and month as a "04" and year as a "2025"
      Then click on purchase button
      Then verify order placed successfully with the message "Thank you for your purchase!"