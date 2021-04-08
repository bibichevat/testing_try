package app.services;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;

public class FilterPage extends BasePage {

    public SelenideElement computers = $x(".//div[@class='s-width']/ul/li[2]/a");
    public SelenideElement tablets = $x(".//div[@class='s-width']/ul/li[2]/div/div/a[2]");
    public SelenideElement minPriceInput = $x(".//input[@id='minPrice_']");
    public SelenideElement showButton = $x(".//input[@id='match_submit']");

    public FilterPage(String pageUrl) {
        super(pageUrl);
    }

    public void beginFilter(String price) {
        computers.click();
        tablets.click();
        minPriceInput.setValue(price);
        showButton.scrollTo();
        showButton.click();
    }
}
