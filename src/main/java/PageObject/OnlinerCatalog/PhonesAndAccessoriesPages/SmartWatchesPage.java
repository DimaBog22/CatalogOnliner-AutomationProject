package PageObject.OnlinerCatalog.PhonesAndAccessoriesPages;

import PageObject.OnlinerCatalog.BasePage;
import org.openqa.selenium.By;

public class SmartWatchesPage extends BasePage {

    private By smartWatchesPageTitle = By.xpath("//h1[contains(text(), 'Умные часы и браслеты')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");

    public SmartWatchesPage verifyPage() {

        isDisplayed(smartWatchesPageTitle, catalogTab, adsTab);
        return this;

    }

    public SmartWatchesPage checkTitle() {

        checkTitle(smartWatchesPageTitle, "Умные часы и браслеты");
        return this;

    }

}
