import PageObject.OnlinerCatalog.HomePage;
import org.testng.annotations.Test;
import static PageObject.OnlinerCatalog.HomePageCatalogLinkEnum.*;

public class FirstTest {

    HomePage homePage = new HomePage();

    @Test
    public void Test1() {

        homePage.openPage()
                .verifyHomePage()
                .clickLink(ELECTRONICS);

    }
    @Test
    public void Test2() {

        homePage.openPage()
                .verifyHomePage()
                .clickLink(COMPUTERS);

    }
    @Test
    public void Test3() {

        homePage.openPage()
                .verifyHomePage()
                .clickLink(APPLIANCES);

    }

}
