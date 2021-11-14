import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.LoginPage.LoginPage;
import driver.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(priority = 6)
    public void successfulLogin() throws InterruptedException {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("valdemarius000007@gmail.com",
                        "Valdi4Paldi4_221");

        Thread.sleep(5000);

        homePage.openPage()
                .goToUserProfilePage()
                .checkUserIsLoggedIn();

    }
    @Test(priority = 1)
    public void loginIsAbsent() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("",
                        "Valdi4Paldi4_221")
                .verifyLoginIsAbsentError();

    }
    @Test(priority = 2)
    public void passwordIsAbsent() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("valdemarius000007@gmail.com",
                        "")
                .verifyPasswordIsAbsentError();

    }
    @Test(priority = 3)
    public void passwordIsIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("valdemarius000007@gmail.com",
                        "123")
                .verifyIncorrectLoginOrPasswordError();

    }
    @Test(priority = 4)
    public void loginIsIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("123",
                        "Valdi4Paldi4_221")
                .verifyIncorrectLoginOrPasswordError();

    }
    @Test(priority = 5)
    public void loginAndPasswordAreIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("123",
                        "123")
                .verifyIncorrectLoginOrPasswordError();

    }

}
