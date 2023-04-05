package NavFort.pages;

import NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;
    @FindBy(name = "_username")
    public WebElement username;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement loginBtn;

    public void loginWithCredentials(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();

    }
}
