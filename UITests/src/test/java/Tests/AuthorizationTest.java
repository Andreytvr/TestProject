package Tests;
import Listeners.TestListener;
import Data.TestData;
import Pages.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})

public class AuthorizationTest extends BaseTest {
    @Test
    public void Authorization() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage()
                .goToLoginPage()
                .doLogin(TestData.mailForAuthorization,TestData.passwordForAuthorization)
                .checkUserEmailInHeader();


    }
}
