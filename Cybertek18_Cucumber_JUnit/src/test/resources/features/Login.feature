Feature: Login Feature
  CBT-277: As a user I shoudl be able to login with correct credentials to different accounts,
  and dashboard should be displayed.



  tags = "@librarian"
    Scenario: Librian login scenario
      Given use is on the login page
      When user logs in as librarian
      Then user should see dashboard
