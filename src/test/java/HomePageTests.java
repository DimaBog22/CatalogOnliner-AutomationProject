import PageObject.OnlinerCatalog.HomePage;
import org.testng.annotations.Test;
import static PageObject.OnlinerCatalog.HomePageCatalogLinkEnum.*;
import static PageObject.OnlinerCatalog.HomePageBrandsLinkEnum.*;

public class HomePageTests {

    HomePage homePage = new HomePage();

//    @Test
    public void checkCatalogItemsAreAvailable() {

        homePage.openPage()
                .clickLink(ELECTRONICS)
                .clickLink(COMPUTERS_AND_NETWORKS)
                .clickLink(APPLIANCES)
                .clickLink(AUTO_AND_MOTO)
                .clickLink(FOOD);

    }
//    @Test
    public void checkBrandItemsAreAvailable() {

        homePage.openPage()
                .clickLink(SUPER_PRICES)
                .clickLink(CASHBACK_15_PERCENT)
                .clickLink(XIAOMI)
                .clickLink(COUNTRY_SEASON)
                .clickLink(FURNITURE);

    }
    @Test
    public void checkCatalogHomePage() {

        homePage.openPage()
                .verifyHomePage()
                .checkHomePageTitle("Каталог")
                .clickOnlinerLogo();

    }

}
