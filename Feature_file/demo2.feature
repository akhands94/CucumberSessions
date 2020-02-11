Feature: Testing demo webshop Register feature

  Scenario: User enters Registers on the site
    Given the Register page is opened
    When user selects the gender
    And user enters first name and last name
    And user enters email akhands0@gmail.com
    And user enters password as password
    And user confirms the password
    Then user will click on Register button
    Then demo webshop home page appears
