package PageObject.Onliner.CatalogPage.PhonesAndAccessoriesPages.MobilePhonesPage;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class Iphone11GB64 extends BasePage {

    private By title = By.cssSelector(".catalog-masthead__title");
    private By addToTheCardBtn = By.xpath("//a[@data-shop-id='256' and contains(text(),'В корзину')]");

    public Iphone11GB64 verifyIphone11GB64Page() {

        isDisplayed(title);
        return this;

    }

    public Iphone11GB64 checkTitle() {

        checkTitle(title, "Смартфон Apple iPhone 11 64GB (черный)");
        return this;

    }

    public Iphone11GB64 addToTheCard() {

        click(addToTheCardBtn);
        return this;

    }

}
