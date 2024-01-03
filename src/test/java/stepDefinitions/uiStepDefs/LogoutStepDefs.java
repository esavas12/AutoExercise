package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.Then;
import pages.LogoutPage;
import pages.SignupPage;
import utilities.ReusableMethods;

public class LogoutStepDefs {
    LogoutPage logoutPage = new LogoutPage();
    SignupPage signupPage = new SignupPage();

    @Then("Click Logout button")
    public void click_logout_button() {
        logoutPage.logout.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        signupPage.signup.isDisplayed();
    }



}
