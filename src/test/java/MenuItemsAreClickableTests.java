import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import driver.BaseTest;
import org.testng.annotations.Test;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Brands.HomePageBrandsLinkEnum.*;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum.*;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum.*;

public class MenuItemsAreClickableTests extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void checkBrandsMenuItems() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(SUPER_PRICES)
                .clickLink(CASHBACK_15_PERCENT)
                .clickLink(NEW_CATALOG_SECTIONS)
                .clickLink(PET_SUPPLIES)
                .clickLink(XIAOMI)
                .clickLink(APPLE)
                .clickLink(IKEA)
                .clickLink(COUNTRY_SEASON)
                .clickLink(FURNITURE);

    }
    @Test
    public void checkCatalogMenuItems() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS)
                .clickLink(COMPUTERS_AND_NETWORKS)
                .clickLink(APPLIANCES)
                .clickLink(CONSTRUCTION_AND_REPAIR)
                .clickLink(HOUSE_AND_GARDEN)
                .clickLink(AUTO_AND_MOTO)
                .clickLink(BEAUTY_AND_SPORT)
                .clickLink(CHILDREN_AND_MOMS)
                .clickLink(WORK_AND_OFFICE)
                .clickLink(FOOD);

    }
    @Test
    public void checkElectronicsMenuItems() {

        homePage.openPage()
                .checkHomePageTitle("Каталог")
                .verifyHomePage()
                .clickLink(ELECTRONICS);

        homePage.clickLink(PHONES_AND_ACCESSORIES)
                .clickLink(TELEVISION_AND_VIDEO)
                .clickLink(TABLETS_AND_ELECTRONIC_BOOKS)
                .clickLink(AUDIO_ENGINEERING)
                .clickLink(HIFI_AUDIO)
                .clickLink(PHOTO_AND_VIDEO)
                .clickLink(VIDEO_GAMES)
                .clickLink(GADGETS)
                .clickLink(SMART_HOUSE_AND_VIDEO)
                .clickLink(ELECTRIC_TRANSPORT)
                .clickLink(TELEPHONY_AND_COMMUNICATIONS)
                .clickLink(MUSICAL_EQUIPMENT)
                .clickLink(OPTICAL_INSTRUMENTS);

    }

}
