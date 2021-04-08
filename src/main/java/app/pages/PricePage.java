package app.pages;

import app.services.FilterPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public class PricePage extends BasePage {

    public SelenideElement last = $x(".//div[@class='ib page-num']/a[last()]");
    public SelenideElement all = $x(".//form[@id='list_form1']");
    public SelenideElement nextPage = $x(".//a[@class = 'ib pager-next']");
    public SelenideElement nick = $x(".//*[@class='info-nick']");

    public FilterPage filterPage = new FilterPage("https://www.e-katalog.ru/");

    public PricePage(String pageUrl) {
        super(pageUrl);
    }

    public void testPrice(String price) {
        filterPage.beginFilter(price);
        int priceInt = Integer.parseInt(price);
        int lastPage = 1;
        try {
            last.scrollTo();
            lastPage = Integer.parseInt(last.getText());
        }
        catch (Exception exception) {
            lastPage = 1;
        }
        nick.scrollTo();
        for (int i = 1; i <= lastPage; i++) {
            List<SelenideElement> listTablet = all.findAll(By.xpath(".//form[@id='list_form1']/div[@id]"));

            listTablet.remove(listTablet.size() - 1);

            for (SelenideElement thing : listTablet) {
                int currentPrice = Integer.parseInt((thing.
                        findElement(By.xpath(".//div[@class = 'model-price-range']//span[1]"))).
                        getText().
                        replace(" ", ""));
                Assert.assertTrue(priceInt > currentPrice);
            }
            if (i < lastPage) {
                nextPage.scrollTo();
                nextPage.click();
            }
        }
    }
}
