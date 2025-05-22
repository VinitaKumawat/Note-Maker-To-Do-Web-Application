package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By email = By.xpath("//input[@id='email']");
    By password = By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//div[contains(@class,'mt-6')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userEmail, String userPassword) {
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(loginBtn).click();
    }
}
