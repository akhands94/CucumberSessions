Feature: Testing demo webshop loging feature

  Scenario: User enters Username and password
    Given the login page is opened
    When user enters aravind.guggilla57@gmail.com
    And user enters aravind as password
    Then user will click on login button
    Then demo webshop hom page appears
