package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage extends BasePage {

    public SelenideElement gadgets = $x(".//div[@class='s-width']/ul/li[1]/a");
    public SelenideElement cameras = $x(".//a[@class='mainmenu-subitem mainmenu-icon695']");
    public SelenideElement sony = $x(".//*[@id='li_br156']/label");
    public SelenideElement nfc = $x(".//*[@id='preset18920']/li[8]/label");
    public SelenideElement showButton = $x(".//input[@id='match_submit']");
    public SelenideElement camera = $x(".//a[@id='product_918494']/*");
    public SelenideElement toFavoriteButton = $x(".//*[@class='addto-wishlist heart-empty heart_918494']");

    public SelenideElement toMenuButton = $x(".//a[@class='info-nick']");
    public SelenideElement currentCameraInWishList = $x(".//div[@class='touchcarousel-item ctg-slider__wrap ']//a[@href='/SONY-HDR-AS300.htm']");
    public SelenideElement currentCameraInHistory = $x(".//div[@class='user-history-div'][1]/a[@href='/SONY-HDR-AS300.htm']");
    public SelenideElement removeFromWishlistButton = $x(".//div[@class='touchcarousel-item ctg-slider__wrap ']/div[@class='whishlist-action--remove']");
    public SelenideElement thingWishlist = $x(".//div[@class='touchcarousel-item ctg-slider__wrap ']");
    public SelenideElement wishlistLbl = $x(".//a[@class='wu-whishlist-slider--name']");


    public CatalogPage(String pageUrl) {
        super(pageUrl);
    }

    public void searchAndCheckFavorites() {
        gadgets.click();
        cameras.click();
        //sony.scrollTo();
        sony.click();
        nfc.scrollTo();
        nfc.click();
        showButton.scrollTo();
        showButton.click();
        camera.click();
        toFavoriteButton.click();
        toMenuButton.click();
        currentCameraInWishList.shouldBe(Condition.visible);
        currentCameraInHistory.shouldBe(Condition.visible);
        thingWishlist.hover();
        removeFromWishlistButton.click();
    }
}


