
@smoke  @regression
Feature: Library app login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenario in the feature file ,user is expected to be on login page
    Given user is  on the library login page
    #Background is similar to beforeMethod in testNG and it runs before Scenario in that specific feature file
    #The step we pass under the background:Will execute only once before each step
    #Importanct thing to keep on mind is that "Background": Will be applying to each and every scenario in the same repeating
  @smoke
  Scenario: Login as a library

    #Given user is  on the library login page

    When user enters librarian username

    And user enters librarian password

    Then user should see dashboard

    @student @smoke
    Scenario: Login as a student

     # Given user is  on the library login page

      When user enters student username

      And user enters student password

      Then user should see dashboard

      @admin @student
      Scenario: Login as a admin
        #Given user is  on the library login page

        When user enters admin username

        And user enters admin password

        Then user should see dashboard







