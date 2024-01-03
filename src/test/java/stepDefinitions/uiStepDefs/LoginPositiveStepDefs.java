package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.SignupPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginPositiveStepDefs {
    SignupPage signupPage = new SignupPage();
    LoginPage loginPage = new LoginPage();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        loginPage.loginToAccount.isDisplayed();
    }

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {

        loginPage.loginEmail.click();
        loginPage.loginEmail.sendKeys(ConfigReader.getProperty("emailPositive"),Keys.TAB,ConfigReader.getProperty("passwordPositive"));
    }

    @Then("Click login button")
    public void click_login_button() {

        loginPage.submit.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        signupPage.accountDeleted.isDisplayed();

    }
}


