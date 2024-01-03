package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUpScenarios(){
        System.out.println("Before Test");
    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Test");

        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(failedScreenshot, "image/png", "failed_scenario_"+scenario.getName());
            Driver.closeDriver();
        }
    }
}
