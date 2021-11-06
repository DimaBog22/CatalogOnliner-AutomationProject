import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import org.testng.annotations.Test;

public class HomePageTests {

    HomePage homePage = new HomePage();

    @Test
    public void loginIntoOnliner() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .goToLoginPage();

    }

}
