import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.*;
import driver.BaseTest;
import org.testng.annotations.Test;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum.ELECTRONICS;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum.PHONES_AND_ACCESSORIES;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories.PhonesAndAccessoriesLinkEnum.*;

public class VerificationOfPhonesAndAccessoriesPagesTests extends BaseTest {

    HomePage homePage = new HomePage();
    HeadphonesPage headphonesPage = new HeadphonesPage();
    FitnessBraceletsPage fitnessBraceletsPage = new FitnessBraceletsPage();
    MemoryCardsPage memoryCardsPage = new MemoryCardsPage();
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
    public void checkHeadphonesPage() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES);

        homePage.clickLink(HEADPHONES);

        headphonesPage.verifyPage()
                .checkTitle();

    }
    @Test
    public void checkFitnessBraceletsPage() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES);

        homePage.clickLink(FITNESS_BRACELETS);

        fitnessBraceletsPage.verifyPage()
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
    @Test
    public void checkMemoryCardsPage() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES);

        homePage.clickLink(MEMORY_CARDS);

        memoryCardsPage.verifyPage()
                .checkTitle();

    }

}
