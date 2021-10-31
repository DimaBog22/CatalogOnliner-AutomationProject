import PageObject.OnlinerCatalog.HomePage;
import org.testng.annotations.Test;
import static PageObject.OnlinerCatalog.HomePageCatalogLinkEnum.*;

public class HomePageTests {

    HomePage homePage = new HomePage();

//    @Test
    public void checkCatalogItemsAreAvailable() {

        homePage.openPage()
                .clickLink(ELECTRONICS)
                .clickLink(COMPUTERS)
                .clickLink(APPLIANCES);

    }
    @Test
    public void checkCatalogHomePage() {

        homePage.openPage()
                .verifyHomePage()
                .checkHomePageTitle("Каталог")
                .clickOnlinerLogo();

    }

}
