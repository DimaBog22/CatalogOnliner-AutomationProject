package PageObject.OnlinerCatalog.PhonesAndAccessoriesPages;

import PageObject.OnlinerCatalog.BasePage;
import org.openqa.selenium.By;

public class PortableChargersPage extends BasePage {

    private By portableChargersPageTitle = By.xpath("//h1[contains(text(), 'Портативные зарядные устройства')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");

    public PortableChargersPage verifyPage() {

        isDisplayed(portableChargersPageTitle, catalogTab, adsTab);
        return this;

    }

    public PortableChargersPage checkTitle() {

        checkTitle(portableChargersPageTitle, "Портативные зарядные устройства");
        return this;

    }

}
