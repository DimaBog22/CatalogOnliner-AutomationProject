import PageObject.Onliner.CardPage.CardPage;
import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage.Iphone11GB64;
import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage.MobilePhonesPage;
import PageObject.Onliner.Header;
import PageObject.Onliner.LoginPage.LoginPage;
import driver.BaseTest;
import org.testng.annotations.Test;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum.PHONES_AND_ACCESSORIES;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories.PhonesAndAccessoriesLinkEnum.MOBILE_PHONES;
import static PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum.ELECTRONICS;

public class AddAndRemoveItemViaMenusTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MobilePhonesPage mobilePhonesPage = new MobilePhonesPage();
    Iphone11GB64 iphone11GB64 = new Iphone11GB64();
    Header header = new Header();
    CardPage cardPage = new CardPage();

    @Test(priority = 1)
    public void addItemToTheCard() throws InterruptedException {

        homePage.openPage()
                .goToLoginPage();

        loginPage.verifyLoginPage()
                 .loginIntoApplication("valdemarius000007@gmail.com",
                "Valdi4Paldi4_221");

        Thread.sleep(5000); // to avoid StaleElementReferenceException

        homePage.clickLink(ELECTRONICS)
                .clickLink(PHONES_AND_ACCESSORIES)
                .clickLink(MOBILE_PHONES);

        mobilePhonesPage.verifyPage()
                        .checkTitle()
                        .clickOnAppleCheckBox();

        Thread.sleep(5000);

        mobilePhonesPage.clickOnIphone11GB64();

        iphone11GB64.verifyIphone11GB64Page()
                    .checkTitle()
                    .addToTheCard();

        header.checkBadgeHasOneItemInside()
              .goToTheCard();

        cardPage.verifyCardPage()
                .checkNameOfItem();

    }
    @Test(priority = 2)
    public void removeItemFromTheCard() {

        homePage.openPage();

        header.goToTheCard();

        cardPage.verifyCardPage()
                .checkNameOfItem()
                .removeItemFromCard();

    }

}
