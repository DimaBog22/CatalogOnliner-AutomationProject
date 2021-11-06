package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class FitnessBraceletsPage extends BasePage {

    private By fitnessBraceletsPageTitle = By.xpath("//h1[contains(text(), 'Фитнес-браслеты')]");
    private By catalogTab = By.xpath("//span[contains(text(), 'Каталог') and @class='schema-filter-control__switcher-inner']");
    private By adsTab = By.xpath("//span[contains(text(), 'Объявления') and @class='schema-filter-control__switcher-inner']");

    public FitnessBraceletsPage verifyPage() {

        isDisplayed(fitnessBraceletsPageTitle, catalogTab, adsTab);
        return this;

    }

    public FitnessBraceletsPage checkTitle() {

        checkTitle(fitnessBraceletsPageTitle, "Фитнес-браслеты");
        return this;

    }

}
