package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.SignupPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginNegativeStepDefs {
    LoginPage loginPage = new LoginPage();

  @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
      loginPage.loginEmail.sendKeys(ConfigReader.getProperty("emailNegative"), Keys.TAB,ConfigReader.getProperty("passwordNegative"));
}

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
      loginPage.incorrect.isDisplayed();
    }
}
