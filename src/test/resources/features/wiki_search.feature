#TC#2: Wikipedia Search Functionality Title Verification
#1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
#3. User clicks wiki search button
#4. User sees Steve Jobs is in the wiki title

Feature: Wikipedia Search Functionality Title Verification

  Background:
    Given  User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification


    When User types "Steve Jobs" in the wiki search box

    And User clicks wiki search button

    Then User sees "Steve Jobs" is in the wiki title

  @scenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT


    When User types "<searchValue>" in the wiki search box

    And User clicks wiki search button

    Then User sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue   | expectedTitle |
      | Steve Jobs    | Steve Jobs    |
      | Bill Gates    | Bill Gates    |
      | Elon Musk     | Elon Musk     |
      | Arsene Wenger | Arsene Wenger |
      | Joes Biden    | Joes Biden    |
