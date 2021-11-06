package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class MemoryCardsPage extends BasePage {

    private By memoryCardsPageTitle = By.xpath("//h1[contains(text(), 'Карты памяти microSD microSDXC microSDHC')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");

    public MemoryCardsPage verifyPage() {

        isDisplayed(memoryCardsPageTitle, catalogTab, adsTab);
        return this;

    }

    public MemoryCardsPage checkTitle() {

        checkTitle(memoryCardsPageTitle, "Карты памяти microSD microSDXC microSDHC");
        return this;

    }

}
