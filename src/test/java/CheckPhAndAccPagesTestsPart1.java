import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.*;
import driver.BaseTest;
import org.testng.annotations.Test;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum.ELECTRONICS;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum.PHONES_AND_ACCESSORIES;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories.PhonesAndAccessoriesLinkEnum.*;

public class CheckPhAndAccPagesTestsPart1 extends BaseTest {

    HomePage homePage = new HomePage();
    HeadphonesPage headphonesPage = new HeadphonesPage();
    FitnessBraceletsPage fitnessBraceletsPage = new FitnessBraceletsPage();
    MemoryCardsPage memoryCardsPage = new MemoryCardsPage();

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
