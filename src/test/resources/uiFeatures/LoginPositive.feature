Feature: Login Feature Positive

  @loginPositive @ui @login
  Scenario: User should be able to login with valid credentials

    Given Go to the URL
    When Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible

