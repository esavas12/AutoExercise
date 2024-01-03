package stepDefinitions.uiStepDefs;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.SignupPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

import static utilities.Driver.getDriver;

public class SignupStepDefs {
    Faker faker = new Faker();
    Robot robot = new Robot();
    SignupPage signupPage = new SignupPage();

    Actions action = new Actions(Driver.getDriver());

    public SignupStepDefs() throws AWTException {
    }

    @Given("Go to the URL")
    public void user_goes_to_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(signupPage.homePage.isDisplayed());
        Assert.assertEquals("https://automationexercise.com/",getDriver().getCurrentUrl());
    }
    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        ReusableMethods.waitFor(1);
      signupPage.signup.click();
    }
    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
     ReusableMethods.waitFor(1);
     signupPage.newUserSignup.isDisplayed();

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        ReusableMethods.waitFor(1);
      signupPage.name.sendKeys(faker.name().firstName(),Keys.TAB,faker.internet().emailAddress());
    }
    @Then("Click Signup button")
    public void click_signup_button() {
        signupPage.signUpButton.click();
    }
    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_ınformatıon_is_visible() {
       ReusableMethods.waitFor(1);
        signupPage.EnterAccInfo.isDisplayed();
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        ReusableMethods.waitFor(1);
        signupPage.title.click();
        ReusableMethods.waitFor(1);
        robot.mouseWheel(3);
        signupPage.nameS.sendKeys(faker.name().firstName(),Keys.TAB,faker.internet().emailAddress(),Keys.TAB,faker.internet().password());
        ReusableMethods.waitFor(1);
        Select select1 = new Select(signupPage.day);
        select1.selectByIndex(15);
        ReusableMethods.waitFor(1);
        Select select2 = new Select(signupPage.month);
        select2.selectByIndex(5);
        ReusableMethods.waitFor(1);
        Select select3 = new Select(signupPage.year);
        select3.selectByIndex(27);

    }
    @Then("Select checkbox Sign up for our newsletter")
    public void select_checkbox_sign_up_for_our_newsletter() {
      ReusableMethods.waitFor(1);
      signupPage.signupfonp.click();

    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
    ReusableMethods.waitFor(1);
    signupPage.receiveS.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
     ReusableMethods.waitFor(1);

     action.moveToElement(signupPage.firstName);
     //signupPage.firstName.click();
        ReusableMethods.clickWithJS(signupPage.firstName);
     ReusableMethods.waitFor(1);
//        signupPage.firstName.sendKeys(ConfigReader.getProperty("Firstname"),Keys.TAB,ConfigReader.getProperty("Lastname"),
//                Keys.TAB,ConfigReader.getProperty("Company"),Keys.TAB,ConfigReader.getProperty("Address"),Keys.TAB,
//                ConfigReader.getProperty("Address2"),Keys.TAB, ConfigReader.getProperty("Country")
//                );
        signupPage.firstName.sendKeys(faker.name().firstName(),Keys.TAB,faker.name().lastName(),Keys.TAB,faker.company().name(),
                Keys.TAB, faker.address().fullAddress(),Keys.TAB,faker.address().fullAddress(),Keys.TAB,faker.country().capital());
        ReusableMethods.waitFor(1);
      Select select = new Select(signupPage.country);
      select.selectByIndex(6);
//      signupPage.state.sendKeys(ConfigReader.getProperty("State"),Keys.TAB, ConfigReader.getProperty("City"), Keys.TAB,
//              ConfigReader.getProperty("Zipcode"),Keys.TAB,ConfigReader.getProperty("MobileNumber"));
      signupPage.state.sendKeys(faker.country().capital(),Keys.TAB,faker.address().city(),
              Keys.TAB,faker.address().zipCode(),Keys.TAB,faker.phoneNumber().cellPhone());
    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        ReusableMethods.waitFor(1);
        //signupPage.createAccount.click();
        ReusableMethods.clickWithJS(signupPage.createAccount);

    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
    ReusableMethods.waitFor(1);
    signupPage.accountCreated.isDisplayed();
    }
    @Then("Click Continue button")
    public void click_continue_button() {
        ReusableMethods.waitFor(1);
     signupPage.continueB.click();
//     Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
      ReusableMethods.waitFor(1);
      signupPage.usernameVisible.isDisplayed();
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
       ReusableMethods.waitFor(1);
        signupPage.deleteAcc.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        ReusableMethods.waitFor(1);
        signupPage.accountDeleted.isDisplayed();
        ReusableMethods.waitFor(1);
        signupPage.continueB.click();

    }

    @And("Close the browser")
    public void closeTheBrowser() {
        Driver.getDriver().close();
    }
}
