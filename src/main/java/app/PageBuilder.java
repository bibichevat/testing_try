package app;

import app.pages.CatalogPage;
import app.pages.LoginPage;
import app.pages.PricePage;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("https://www.e-katalog.ru/");
    }

    public static CatalogPage buildCatalogPage() {
        return new CatalogPage("https://www.e-katalog.ru/");
    }

    public static PricePage buildPricePage() {
        return new PricePage("https://www.e-katalog.ru/");
    }
}
