package PageObject.OnlinerCatalog;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {

    private By catalogTitle = By.xpath("//h1[text()='Каталог']");

    public HomePage openPage() {

        open("https://catalog.onliner.by/");
        return this;

    }

}
