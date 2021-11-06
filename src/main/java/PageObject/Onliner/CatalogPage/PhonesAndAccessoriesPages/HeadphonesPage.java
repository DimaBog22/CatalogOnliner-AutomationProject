package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class HeadphonesPage extends BasePage {

    private By headphonesPageTitle = By.xpath("//h1[contains(text(), 'Наушники и гарнитуры')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");

    public HeadphonesPage verifyPage() {

        isDisplayed(headphonesPageTitle, catalogTab, adsTab);
        return this;

    }

    public HeadphonesPage checkTitle() {

        checkTitle(headphonesPageTitle, "Наушники и гарнитуры");
        return this;

    }

}
