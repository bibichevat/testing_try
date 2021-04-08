import org.testng.annotations.Test;

public class SearchInCatalogTest extends A_BaseTest{

    @Test(description = "Поиск по каталогу, добавление в закладки", priority = 2)
    public void searchAndCheckFavorites() {
        app.loginPage.open();
        app.loginPage.login("tanyatest", "testforlesson384");

        app.catalogPage.searchAndCheckFavorites();

        app.loginPage.logout();

        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");

        softAssert.assertEquals(2,2);
        softAssert.assertAll();
    }
}
