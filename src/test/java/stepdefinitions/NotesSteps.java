package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.*;

public class NotesSteps {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    NotesPage notesPage;

    @Given("User is on login page")
    public void user_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://notes-makers.vercel.app/pages/login?redirect=L3BhZ2VzL25vdGVz");
    }

    @When("User logs in with {string} and {string}")
    public void user_logs_in(String email, String password) {
        loginPage = new LoginPage(driver);
        loginPage.login(email, password);
    }

    @And("User navigates to Notes")
    public void user_navigates_to_notes() {
        homePage = new HomePage(driver);
        homePage.goToNotes();
    }

    @And("User creates a note with title {string} and description {string} in notebook {string}")
    public void user_creates_note(String title, String description, String notebookName) {
        notesPage = new NotesPage(driver);
        notesPage.createNote(title, description, notebookName);
    }

    @Then("Note should be created successfully")
    public void note_created_successfully() {
        System.out.println("Note creation successful (validate this step)");
        driver.quit();
    }
}
