import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.LoginPage.LoginPage;
import driver.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(priority = 6)
    public void successfulLogin() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("qa07qa@mail.ru",
                                      "qa07qa07");

    }
    @Test(priority = 1)
    public void loginIsAbsent() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("",
                        "qa07qa07")
                .verifyLoginIsAbsentError();

    }
    @Test(priority = 2)
    public void passwordIsAbsent() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("qa07qa@mail.ru",
                        "")
                .verifyPasswordIsAbsentError();

    }
    @Test(priority = 3)
    public void passwordIsIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("qa07qa@mail.ru",
                        "123")
                .verifyIncorrectLoginOrPasswordError();

    }
    @Test(priority = 4)
    public void loginIsIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("123",
                        "qa07qa07")
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
