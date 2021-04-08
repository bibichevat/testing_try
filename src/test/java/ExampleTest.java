import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleTest extends A_BaseTest
{
    @Test(description = "Авторизация", priority=1)
    public void loginViaEmail() {
        app.loginPage.open();
        app.loginPage.login("tanyatest", "testforlesson384");

        app.loginPage.logout();
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");

        softAssert.assertEquals(2,2);
        softAssert.assertAll();
    }
}
