package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverCreation.getDriver;

public class Iphone11GB64 extends BasePage {

    private By title = By.cssSelector(".catalog-masthead__title");

    public Iphone11GB64 verifyIphone11GB64Page() {

        isDisplayed(title);
        return this;

    }

    public Iphone11GB64 checkTitle() {

        checkTitle(title, "Смартфон Apple iPhone 11 64GB (черный)");
        return this;

    }

    public Iphone11GB64 addToTheCard() {

        Actions act =  new Actions(getDriver());
        act.moveToElement(getDriver().
                findElement(By.xpath("//a[@data-shop-id='936' and contains(text(),'В корзину')]"))).
                click().perform();
        return this;

    }

}
