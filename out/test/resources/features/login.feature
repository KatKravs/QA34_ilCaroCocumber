Feature:Login

  @validDAta
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User click on Login link
    And User enters valid data
    And User click on Yalla button
    Then User verifies Success Message is displayed
    And User quites browser


  @invalidDAta
  Scenario Outline: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User click on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |

    And User click on Yalla button
    Then User verifies Error is displayed
    And User quites browser
    Examples:
      | email | password |
    |kat@gmail.com|Xbrbnjxrf90|
    |kat@gmail.com|X888888890!|
    |kat@gmail.com|xbrbnjxrf90!|
    |kat@gmail.com|Xbrbnjxrfhg!|