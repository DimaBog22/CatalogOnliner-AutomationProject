import PageObject.OnlinerCatalog.HomePage.HomePage;
import org.testng.annotations.Test;
import static PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum.*;
import static PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Brands.HomePageBrandsLinkEnum.*;
import static PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum.*;
import static PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories.PhonesAndAccessoriesLinkEnum.*;

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
//    @Test
    public void checkElectronicsItemsAreAvailable() {

        homePage.openPage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES)
                .clickLink(TELEVISION_AND_VIDEO)
                .clickLink(SMART_HOUSE_AND_VIDEO)
                .clickLink(GADGETS);

    }
    @Test
    public void checkPhonesAndAccessoriesItemsAreAvailable1() {

        homePage.openPage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES)
                .clickLink(MOBILE_PHONES);


    }
    @Test
    public void checkPhonesAndAccessoriesItemsAreAvailable2() {

        homePage.openPage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES)
                .clickLink(FITNESS_BRACELETS);


    }
    @Test
    public void checkPhonesAndAccessoriesItemsAreAvailable3() {

        homePage.openPage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES)
                .clickLink(MEMORY_CARDS);


    }
//    @Test
    public void checkCatalogHomePage() {

        homePage.openPage()
                .verifyHomePage()
                .checkHomePageTitle("Каталог")
                .clickOnlinerLogo();

    }

}
