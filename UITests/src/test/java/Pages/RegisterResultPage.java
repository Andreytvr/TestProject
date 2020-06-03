package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterResultPage extends BasePage{

    public RegisterResultPage (WebDriver driver) {
        super(driver);
    }


    public  By registrResult = By.className("result");

    @Step("check Message Success Registration")
    public RegisterResultPage checkMessageSuccessRegistration(){
        shouldHaveElementWithText(registrResult,"Your registration completed");
        return this;
    }

}
