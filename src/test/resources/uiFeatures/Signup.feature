Feature: Sign up Feature

    @signup @ui
    Scenario: User should be able to sign up successfully

      Given Go to the URL
      When Verify that home page is visible successfully
      And Click on Signup Login button
      Then Verify New User Signup! is visible
      And Enter name and email address
      And Click Signup button
      Then Verify that ENTER ACCOUNT INFORMATION is visible
      And Fill details: Title, Name, Email, Password, Date of birth
      And Select checkbox Sign up for our newsletter
      And Select checkbox Receive special offers from our partners!
      And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
      And Click Create Account button
      Then Verify that ACCOUNT CREATED! is visible
      And Click Continue button
      Then Verify that Logged in as username is visible
      And Click Delete Account button
      Then Verify that ACCOUNT DELETED! is visible and click Continue button