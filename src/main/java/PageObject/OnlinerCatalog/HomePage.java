package PageObject.OnlinerCatalog;

import PageObject.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By catalogTitle = By.xpath("//h1[text()='Каталог']");

    private By getLink(HomePageCatalogLinkEnum homePageCatalogLinkEnum) {
        return By.cssSelector(homePageCatalogLinkEnum.getLinkText());
    }

    private By getLink(String homePageCatalogLinkEnum) {
        return By.cssSelector(homePageCatalogLinkEnum);
    }

    public HomePage openPage() {

        open("https://catalog.onliner.by/");
        return this;

    }

    public HomePage verifyHomePage() {

        isDisplayed(catalogTitle);
        return this;

    }

    public HomePage clickLink(HomePageCatalogLinkEnum homePageCatalogLinkEnum) {

        click(getLink(homePageCatalogLinkEnum));
        return this;

    }

    public HomePage clickLink(String homePageCatalogLinkEnum) {

        click(getLink(homePageCatalogLinkEnum));
        return this;

    }

}
