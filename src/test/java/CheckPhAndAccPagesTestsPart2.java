import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.*;
import driver.BaseTest;
import org.testng.annotations.Test;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum.PHONES_AND_ACCESSORIES;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories.PhonesAndAccessoriesLinkEnum.*;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum.ELECTRONICS;

public class CheckPhAndAccPagesTestsPart2 extends BaseTest {

    HomePage homePage = new HomePage();
    MobilePhonesPage mobilePhonesPage = new MobilePhonesPage();
    PortableChargersPage portableChargersPage = new PortableChargersPage();
    SmartWatchesPage smartWatchesPage = new SmartWatchesPage();

    @Test
    public void checkMobilePhonesPage() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES);

        homePage.clickLink(MOBILE_PHONES);

        mobilePhonesPage.verifyPage()
                .checkTitle();

    }

    @Test
    public void checkSmartWatchesPage() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES);

        homePage.clickLink(SMART_WATCHES);

        smartWatchesPage.verifyPage()
                .checkTitle();

    }
    @Test
    public void checkPortableChargersPage() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES);

        homePage.clickLink(PORTABLE_CHARGERS);

        portableChargersPage.verifyPage()
                .checkTitle();

    }

}
