import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.LoginPage.LoginPage;
import driver.BaseTest;
import org.testng.annotations.Test;

public class FailedLoginTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginIsAbsent() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("",
                        "qa07qa07")
                .verifyLoginIsAbsentError();

    }
    @Test
    public void passwordIsAbsent() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("qa07qa@mail.ru",
                        "")
                .verifyPasswordIsAbsentError();

    }
    @Test
    public void passwordIsIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("qa07qa@mail.ru",
                        "123")
                .verifyIncorrectLoginOrPasswordError();

    }
    @Test
    public void loginIsIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("123",
                        "qa07qa07")
                .verifyIncorrectLoginOrPasswordError();

    }
    @Test
    public void loginAndPasswordAreIncorrect() {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                .loginIntoApplication("123",
                        "123")
                .verifyIncorrectLoginOrPasswordError();

    }

}
