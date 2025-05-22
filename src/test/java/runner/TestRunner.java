package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import utils.DriverFactory;

@CucumberOptions(
        features = "C:\\Users\\hp5cd\\OneDrive\\Desktop\\selenium Eclipse IDE\\NoteMasterProject\\src\\test\\resources\\Features",
        glue = "stepdefinitions",
        plugin = {
            "pretty",
            "html:target/cucumber-reports.html",
            "json:target/cucumber.json"
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void cleanUp() {
        DriverFactory.quitDriver();
    }
}
