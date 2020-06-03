package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    public RegisterPage (WebDriver driver) {
        super(driver);
    }

    By checkBoxGenderMale = By.id("gender-male");
    By checkBoxGenderFemale = By.id("gender-female");
    By fieldFirstName = By.name("FirstName");
    By fieldLastName = By.name("LastName");
    By fieldEmail = By.name("Email");
    By fieldPassword = By.name("Password");
    By fieldConfirmPassword = By.name("ConfirmPassword");
    By registerButton = By.name("register-button");

    @Step("Do Registration")
    public RegisterResultPage registration(String gender, String name, String lastName, String email, String password){
        if(gender.toLowerCase().equals("male")){
            driver.findElement(checkBoxGenderMale).click();
        }else if (gender.toLowerCase().equals("female")){
            driver.findElement(checkBoxGenderFemale).click();
        }

        writeText(fieldFirstName, name);
        writeText(fieldLastName, lastName);
        writeText(fieldEmail, email);
        writeText(fieldPassword, password);
        writeText(fieldConfirmPassword, password);
        driver.findElement(registerButton).click();
        return new RegisterResultPage(driver);

    }


}
