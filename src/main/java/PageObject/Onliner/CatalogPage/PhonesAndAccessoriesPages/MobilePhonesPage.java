package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class MobilePhonesPage extends BasePage {

    private By mobilePhonesPageTitle = By.xpath("//h1[contains(text(), 'Мобильные телефоны')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");

    public MobilePhonesPage verifyPage() {

        isDisplayed(mobilePhonesPageTitle, catalogTab, adsTab);
        return this;

    }

    public MobilePhonesPage checkTitle() {

        checkTitle(mobilePhonesPageTitle, "Мобильные телефоны");
        return this;

    }

}
