package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    By fieldEmail = By.name("Email");
    By fieldPassord = By.name("Password");
    By buttonLogin = By.ByClassName.cssSelector("[class='button-1 login-button']");

    @Step("Do login")
    public HomePage doLogin(String mail, String password){
        writeText(fieldEmail, mail);
        writeText(fieldPassord,password);
        driver.findElement(buttonLogin).click();
        return new HomePage(driver);
    }


}
