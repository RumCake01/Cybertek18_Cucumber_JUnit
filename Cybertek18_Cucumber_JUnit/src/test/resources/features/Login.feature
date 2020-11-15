Feature: Login Feature
  CBT-277: As a user I shoudl be able to login with correct credentials to different accounts,
  and dashboard should be displayed.

@librarian
    Scenario: Librian login scenario
      Given user is on the login page
      When user logs in as librarian
      Then user should see dashboard

@student
  Scenario: Student login scenario
    Given user is on the login page
    When user logs in as student
    Then user should see dashboard

@admin
  Scenario: Admin login scenario
    Given use is on the login page
    When user logs in as admin
    Then user should see dashboard