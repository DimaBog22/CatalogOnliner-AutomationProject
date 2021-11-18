package PageObject.Onliner.CardPage;

import PageObject.Onliner.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Locale;

import static driver.DriverCreation.getDriver;

@Log4j2

public class CardPage extends BasePage {

    private By title = By.className("cart-form__title");
    private By itemName = By.xpath("//a[contains(text(),'Смартфон Apple iPhone 11 64GB (черный)')]");
    private By orderBtn = By.cssSelector(".cart-form__control>a.button-style_primary");

    public CardPage verifyCardPage() {

        isDisplayed(title, itemName, orderBtn);
        return this;

    }

    public CardPage checkNameOfItem() {

        String name = getElementText(itemName).trim().toLowerCase(Locale.ROOT);
        String expectedResult = "Смартфон Apple iPhone 11 64GB (черный)";
        log.info("name is " + name);
        Assert.assertEquals(name, expectedResult.toLowerCase(Locale.ROOT));
        return this;

    }

    public CardPage makeAnOrder() {

        click(orderBtn);
        return this;

    }

    public CardPage removeItemFromCard() {

        WebElement removeBtn = getDriver().findElement(By.cssSelector("a.button-style.button-style_auxiliary.button-style_small.cart-form__button.cart-form__button_remove"));
        Actions builder = new Actions(getDriver());
        builder.moveToElement(removeBtn).click(removeBtn).build().perform();
        log.info("item is removed from the card");
        return this;

    }


}
