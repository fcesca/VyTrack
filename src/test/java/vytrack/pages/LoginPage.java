package vytrack.pages;

import vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "_username")
    public WebElement inputUsername;

    @FindBy(name = "_password")
    public WebElement inputPassword;

    @FindBy(id = "remember_me")
    public WebElement rememberMeCheckbox;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotPasswordBtn;

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }
}
