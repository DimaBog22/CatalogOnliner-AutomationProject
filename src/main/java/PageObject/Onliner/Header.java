package PageObject.Onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverCreation.getDriver;

public class Header extends BasePage{

    private By onlinerLogo = By.className("onliner_logo");
    private By inputSearch = By.name("query");
    private By cardBadge = By.className("b-top-profile__cart");
    private By cardBadgeHas1Value = By.className("b-top-profile__cart");
    private By itemName = By.xpath("//a[contains(text(),'Смартфон Apple iPhone 11 64GB (черный)')]");

    public Header verifyHeader() {

        isDisplayed(onlinerLogo, inputSearch, cardBadge);
        return this;

    }

    public Header clickOnlinerLogo() {

        click(onlinerLogo);
        return this;

    }

    public Header checkBadgeHasOneItemInside() {

        isDisplayed(cardBadgeHas1Value);
        return this;

    }

    public Header goToTheCard() {

        click(cardBadge);
        return this;

    }

    public Header findAnItem(String name){

        enter(inputSearch, name);
        WebElement newFrame = getDriver().findElement(By.cssSelector(".modal-iframe"));
        getDriver().switchTo().frame(newFrame);
        click(itemName);
        return this;

    }

}
