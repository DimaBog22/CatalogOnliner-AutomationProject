package PageObject.OnlinerCatalog.HomePage;

import PageObject.OnlinerCatalog.BasePage;
import PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Brands.HomePageBrandsLinkEnum;
import PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Catalog.Electronics.ElectronicsLinkEnum;
import PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories.PhonesAndAccessoriesLinkEnum;
import PageObject.OnlinerCatalog.HomePage.NavigationMenuEnums.Catalog.HomePageCatalogLinkEnum;
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

    private By getLink(HomePageBrandsLinkEnum homePageBrandsLinkEnum) {
        return By.cssSelector(homePageBrandsLinkEnum.getLinkText());
    }

    public HomePage clickLink(HomePageBrandsLinkEnum homePageBrandsLinkEnum) {

        click(getLink(homePageBrandsLinkEnum));
        return this;

    }

    private By getLink(ElectronicsLinkEnum electronicsLinkEnum) {
        return By.xpath(electronicsLinkEnum.getLinkText());
    }

    public HomePage clickLink(ElectronicsLinkEnum electronicsLinkEnum) {

        click(getLink(electronicsLinkEnum));
        return this;

    }

    private By getLink(PhonesAndAccessoriesLinkEnum phonesAndAccessoriesLinkEnum) {
        return By.xpath(phonesAndAccessoriesLinkEnum.getLinkText());
    }

    public HomePage clickLink(PhonesAndAccessoriesLinkEnum phonesAndAccessoriesLinkEnum) {

        click(getLink(phonesAndAccessoriesLinkEnum));
        return this;

    }

    public HomePage clickOnlinerLogo() {

        click(onlinerLogo);
        return this;

    }

}
