package PageObject;

import driver.BaseTest;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.Locale;
import static driver.DriverCreation.getDriver;
@Log4j2

public class BasePage extends BaseTest {

    protected void open(String url) {
        log.info(url + " is opened");
        getDriver().get(url);
    }

    protected void enter(By element, CharSequence... charSequences) {
        getDriver().findElement(element).clear();
        getDriver().findElement(element).sendKeys(charSequences);
        log.info(element + " was filled");
    }

    protected void click(By element) {

        getDriver().findElement(element).click();
        log.info(element + " was clicked");

    }

    protected void checkTitle(By element, String expectedResult) {

        String actualResult = getElementText(element).toLowerCase(Locale.ROOT);
        log.info("title is " + "\"" + actualResult + "\"");
        Assert.assertEquals(actualResult, expectedResult.toLowerCase(Locale.ROOT));

    }

    protected String getElementText(By element) {

        log.info(element + " has value inside " + getDriver().findElement(element).getText());
        return getDriver().findElement(element).getText();

    }

    protected Integer getElementsCount(By element) {
        return getDriver().findElements(element).size();
    }

    protected Boolean isElementPresented(By element){

        if(getDriver().findElements(element).size() != 0) {
            log.info(element + " has size " + getDriver().findElements(element).size());
            return true;
        }
        return false;

    }

    protected void isDisplayed(By... elements) {
        for (By element : elements) {
            Assert.assertTrue(getDriver().findElement(element).isDisplayed(), "Element :: " + elements + " is not exist.");
        }
    }

}