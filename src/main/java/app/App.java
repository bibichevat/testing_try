package app;

import app.pages.CatalogPage;
import app.pages.LoginPage;
import app.pages.PricePage;

public class App {

    public LoginPage loginPage;
    public CatalogPage catalogPage;
    public PricePage pricePage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        catalogPage = PageBuilder.buildCatalogPage();
        pricePage = PageBuilder.buildPricePage();
    }
}
