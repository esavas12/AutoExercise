package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage {
    public SignupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//img[@alt='Website for automation practice']")
    public WebElement homePage;

    @FindBy(linkText = "Signup / Login")
    public WebElement signup;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement name;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUpButton;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement EnterAccInfo;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement title;

    @FindBy(css = "input#name")
    public WebElement nameS;

    @FindBy(css = "select#days")
    public WebElement day;

    @FindBy(css = "select#months")
    public WebElement month;

    @FindBy(css = "select#years")
    public WebElement year;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement signupfonp;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement receiveS;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(css = "select[data-qa='country']")
    public WebElement country;

    @FindBy(css = "input#state")
    public WebElement state;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(css = "a[data-qa='continue-button']")
    public WebElement continueB;

    @FindBy(css = "i[class='fa fa-user']")

    public WebElement usernameVisible;

    @FindBy(xpath = "(//a[@style='color:brown;'])[2]")
     public WebElement deleteAcc;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement accountDeleted;













}
