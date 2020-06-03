package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    public void writeText (By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }

    public String readText(By elementBy){
        return driver.findElement(elementBy).getText();
    }

    public void shouldHaveElementWithText(By elementBy, String expectedText){
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void shouldBeElement(By elementBy){
        try {
            driver.findElement(elementBy);
        }
        catch (NoSuchElementException ex){
            Assert.fail();
        }
        Assert.assertTrue(true);

    }

}
