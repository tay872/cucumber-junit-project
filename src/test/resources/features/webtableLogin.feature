#TC #: Login scenario
#1- Open a chrome browser 2- Go to:
#https://web-table-2.cydeo.com/login
#3- Enter  username:  Test
#4- Enter password: Tester
#5- Verify URL:
#Expected: URL should end with “orders”
Feature: Login scenario

  Background:
    Given user is on the login page of web table app

  Scenario: Login scenario with 1 param

    When user enter username"Test"
    And user enter password"Tester" as a password
    And user click login button
    Then user should see url contain orders


  Scenario: Login scenario with 1 param
    When user enter username"Test" password "Tester" and click login button
    Then user should see url contain orders

  @webTableApp
  Scenario: Login scenario with data table

    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contain orders


