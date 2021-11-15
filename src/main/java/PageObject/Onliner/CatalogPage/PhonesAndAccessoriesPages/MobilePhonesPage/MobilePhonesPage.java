package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MobilePhonesPage extends BasePage {

    private By mobilePhonesPageTitle = By.xpath("//h1[contains(text(), 'Мобильные телефоны')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");
    private By appleCheckBox = By.xpath("//*[@id=\"schema-filter\"]/div[3]/div[6]/div[2]/ul/li[1]/label");
    private By iphone11GB64 = By.cssSelector("a[href='https://catalog.onliner.by/mobile/apple/iphone1164b']>span[data-bind='html: product.extended_name || product.full_name']");
    public MobilePhonesPage verifyPage() {

        isDisplayed(mobilePhonesPageTitle, catalogTab, adsTab);
        return this;

    }

    public MobilePhonesPage checkTitle() {

        checkTitle(mobilePhonesPageTitle, "Мобильные телефоны");
        return this;

    }

    public MobilePhonesPage clickOnAppleCheckBox() {

        click(appleCheckBox);
        return this;

    }

    public MobilePhonesPage clickOnIphone11GB64() {

        Actions act =  new Actions(driver);
        act.moveToElement(driver.
                findElement(By.cssSelector("a[href='https://catalog.onliner.by/mobile/apple/iphone1164b']>span[data-bind='html: product.extended_name || product.full_name']"))).
                click().perform();
        return this;

    }

}
