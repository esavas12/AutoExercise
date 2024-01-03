package utilities;
import pages.*;

public class Pages {
    private LoginPage loginPage;
    private LogoutPage homePage;



    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public LogoutPage logout() {
        if (homePage == null) {
            homePage = new LogoutPage();
        }
        return homePage;
    }

}
