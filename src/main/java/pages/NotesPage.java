package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class NotesPage {
    WebDriver driver;
    FluentWait<WebDriver> wait;

    public NotesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
    }

    @FindBy(xpath = "//strong[normalize-space()='Write Notes']")
    WebElement writeNoteBtn;

    @FindBy(xpath = "//input[contains(@class, 'p-3') and contains(@class, 'w-full')]")
    WebElement noteTitle;

    @FindBy(xpath = "//div[contains(@class,'ql-editor')]")
    WebElement editor;

    @FindBy(xpath = "//div[@class='css-1xc3v61-indicatorContainer']//*[name()='svg']")
    WebElement notebookDropdown;

    By notebookInputFieldBy = By.xpath("//input[contains(@id, 'react-select')]");

    @FindBy(xpath = "//strong[normalize-space()='Save Changes']")
    WebElement saveChangesBtn;

    public void createNote(String title, String description, String notebookName) {
        wait.until(ExpectedConditions.elementToBeClickable(writeNoteBtn)).click();

        WebElement titleField = wait.until(ExpectedConditions.visibilityOf(noteTitle));
        titleField.sendKeys(title);

        try {
            editor.sendKeys(description);
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript(
                "arguments[0].innerHTML = arguments[1];", editor, description
            );
        }

        wait.until(ExpectedConditions.elementToBeClickable(notebookDropdown)).click();

        WebElement notebookInput = wait.until(ExpectedConditions.visibilityOfElementLocated(notebookInputFieldBy));
        notebookInput.sendKeys(notebookName);
        notebookInput.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(saveChangesBtn)).click();
    }
}
