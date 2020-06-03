package Tests;


import Pages.HomePage;
import Listeners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static Data.TestData.generateMail;


@Listeners({TestListener.class})

public class RegistrationTest extends BaseTest{

    @Test
    public void Registration() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage()
                .goToRegistrPage()
                .registration("male","TestName","TestLastName", generateMail(),"qwerty")
                .checkMessageSuccessRegistration();



    }
}
