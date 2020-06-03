package Pages;

import Data.TestData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver) {
        super(driver);
    }

    String baseURL = "http://demowebshop.tricentis.com/";


    By registerLink = By.className("ico-register");
    By loginLink = By.className("ico-login");
    By userEmail = By.className("account");

    @Step("Open Home Page")
    public HomePage openHomePage (){
        driver.get(baseURL);
        return this;
    }

    @Step("Open Registr Page")
    public RegisterPage goToRegistrPage(){
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }

    @Step("Open Login Page")
    public LoginPage goToLoginPage(){
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }
    @Step("Check User Email In Header")
    public HomePage checkUserEmailInHeader(){
        shouldHaveElementWithText(userEmail, TestData.mailForAuthorization);
        return this;
    }


}
