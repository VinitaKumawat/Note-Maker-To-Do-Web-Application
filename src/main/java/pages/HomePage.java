package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[contains(@class,'bg-primary-50') and .//img]")
    WebElement profileIcon;

    By notesOptionBy = By.xpath("//li[normalize-space()='Notes']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToNotes() {
        wait.until(ExpectedConditions.elementToBeClickable(profileIcon)).click();

       
        wait.until(ExpectedConditions.elementToBeClickable(notesOptionBy)).click();
    }
}
