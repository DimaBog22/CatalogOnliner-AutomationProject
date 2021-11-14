import PageObject.Onliner.CardPage.CardPage;
import PageObject.Onliner.CatalogPage.HomePage.HomePage;
import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage.Iphone11GB64;
import PageObject.Onliner.Header;
import PageObject.Onliner.LoginPage.LoginPage;
import driver.BaseTest;
import org.testng.annotations.Test;

public class AddAndRemoveItemViaSearchInputTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Iphone11GB64 iphone11GB64 = new Iphone11GB64();
    Header header = new Header();
    CardPage cardPage = new CardPage();

    @Test(priority = 1)
    public void addItemToTheCard() throws InterruptedException {

        homePage.openPage()
                .checkUserIsLoggedIn();

        loginPage.verifyLoginPage()
                .loginIntoApplication("valdemarius000007@gmail.com",
                        "Valdi4Paldi4_221");

        Thread.sleep(5000); // to avoid StaleElementReferenceException

        header.findAnItem("Смартфон Apple iPhone 11 64GB (черный)");

        iphone11GB64.verifyIphone11GB64Page()
                .checkTitle()
                .addToTheCard();

        header.checkBadgeHasOneItemInside()
                .goToTheCard();

        cardPage.verifyCardPage()
                .checkNameOfItem()
                .checkShopName();

    }
    @Test(priority = 2)
    public void removeItemFromTheCard() {

        homePage.openPage();

        header.goToTheCard();

        cardPage.verifyCardPage()
                .checkNameOfItem()
                .checkShopName()
                .removeItemFromCard();

    }

}
