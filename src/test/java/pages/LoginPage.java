package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage{
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginToAccount;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;


    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement submit;

    @FindBy(css="p[style='color: redcccc;']")
    public WebElement incorrect;
}
