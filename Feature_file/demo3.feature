Feature: Login functionality Testing

  Scenario Outline: Login with mutiple sets of test data
    Given User has opened the application
    When user clicks to signin link
    And user enters "<username>" and "<password>"
    Then user clicks on login button
    Then demo webshop hom page will display

    Examples: 
      | username                       | password    |
      | aravind.guggilla57@gmail.com   | aravind     |
      | aravindkumarguggilla@gmail.com | Aravind@123 |
