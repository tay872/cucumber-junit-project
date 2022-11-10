Feature: Google search functionality

  User Story: As a user, when I am on the google search page I should
              be able to search whatever I want and see relevant information


  Scenario: Search functionality result title verification

  Note: Follow POM
    Given User is on Google search page

    When User types apple in the google search box and clicks enter

    Then User sees apple – Google Search is in the google title

      #this annotation is Working in process
  Scenario: Search functionality result title verification

    Given User is on Google search page

    When User types "apple" in the google search box and clicks enter

    Then User sees "apple - Google Search" is in the google title


