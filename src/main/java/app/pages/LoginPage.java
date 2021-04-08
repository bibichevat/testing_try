package app.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public SelenideElement enterButton = $x(".//*[@class='wu_entr']");
    public SelenideElement loginButton = $x(".//*[@class='signin-with signin-with-ek d-flex justify-content-center align-items-center']");
    public SelenideElement loginField = $x(".//input[@name='l_']");
    public SelenideElement passwordField = $x(".//input[@name='pw_']");
    public SelenideElement signInButton = $x(".//button[@class='ek-form-btn blue']");
    public SelenideElement logoutButton = $x(".//*[@class='help2']");
    public SelenideElement popularLbl = $x(".//*[@class='ib blue brand-page-title']");
    public SelenideElement nick = $x(".//*[@class='info-nick']");

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void login(String login, String password) {

        enterButton.click();
        loginButton.click();
        loginField.setValue(login);
        passwordField.setValue(password);
        signInButton.click();

    }

    public void logout() {
        logoutButton.click();
    }
}
