Feature: Login Feature Negative

  @loginNegative @ui @regression @login
  Scenario: User should not be able to login with invalid credentials

    Given Go to the URL
    When Verify that home page is visible successfully
    And Click on Signup Login button
    Then Enter incorrect email address and password
    Then Verify Login to your account is visible
    And Click login button
    Then Verify error Your email or password is incorrect! is visible


