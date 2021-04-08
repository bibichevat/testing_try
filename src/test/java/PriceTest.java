import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriceTest extends A_BaseTest{

    @Test(description = "Поиск по цене", priority = 3)
    @Parameters({"price"})
    public void testPrice(String price) {
        app.loginPage.open();
        app.loginPage.login("tanyatest", "testforlesson384");

        app.pricePage.testPrice(price);

        app.loginPage.logout();

        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");

        softAssert.assertEquals(2,2);
        softAssert.assertAll();
    }
}
