package PageObject.Onliner;

import PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage.Iphone11GB64;
import PageObject.Onliner.LoginPage.LoginPage;
import org.openqa.selenium.By;

public class Header extends BasePage{

    private By onlinerLogo = By.className("onliner_logo");
    private By inputSearch = By.name("query");
    private By cardBadge = By.className("b-top-profile__cart");
    private By cardBadgeHas1Value = By.className("b-top-profile__cart");

    public Header verifyHeader() {

        isDisplayed(onlinerLogo, inputSearch, cardBadge);
        return this;

    }

    public Header clickOnlinerLogo() {

        click(onlinerLogo);
        return this;

    }

    public Header checkBadgeHasOneItemInside() {

        isDisplayed(cardBadgeHas1Value);
        return this;

    }

}
