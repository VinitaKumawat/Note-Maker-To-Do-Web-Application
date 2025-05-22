package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;
import static org.testng.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://notes-makers.vercel.app/pages/login?redirect=L3BhZ2VzL25vdGVz");
    }

    @When("User logs in with email {string} and password {string}")
    public void user_logs_in(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("User should be redirected to the notes page")
    public void redirected_to_notes_page() {
        assertTrue(driver.getCurrentUrl().contains("notes"));
    }
}
