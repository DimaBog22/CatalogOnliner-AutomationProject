package PageObject.OnlinerCatalog;

import PageObject.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.Locale;
@Log4j2

public class HomePage extends BasePage {

    private By catalogTitle = By.xpath("//h1[text()='Каталог']");
    private By onlinerLogo = By.className("onliner_logo");
    private By inputSearch = By.name("query");



    public HomePage openPage() {

        open("https://catalog.onliner.by/");
        return this;

    }

    public HomePage verifyHomePage() {

        isDisplayed(catalogTitle, onlinerLogo, inputSearch);
        return this;

    }

    public HomePage checkHomePageTitle(String expectedResult) {

        String actualResult = getElementText(catalogTitle).toLowerCase(Locale.ROOT).substring(0, 7);
        log.info("title is " + "\"" + actualResult + "\"");
        Assert.assertEquals(actualResult, expectedResult.toLowerCase(Locale.ROOT));


        return this;

    }

    private By getLink(HomePageCatalogLinkEnum homePageCatalogLinkEnum) {
        return By.cssSelector(homePageCatalogLinkEnum.getLinkText());
    }

    public HomePage clickLink(HomePageCatalogLinkEnum homePageCatalogLinkEnum) {

        click(getLink(homePageCatalogLinkEnum));
        return this;

    }

    public HomePage clickOnlinerLogo() {

        click(onlinerLogo);
        return this;

    }

}
