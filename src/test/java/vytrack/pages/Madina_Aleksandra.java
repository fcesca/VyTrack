package vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.ConfigurationReader;
import vytrack.utilities.Driver;

public class Madina_Aleksandra {
    public Madina_Aleksandra(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement username;


    @FindBy (id = "prependedInput2")
    public WebElement password;

    @FindBy (id = "_submit")
    public WebElement loginBtn;


    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

    @FindBy (xpath = "//h1[.='Cars']")
    public WebElement isDisplaCar;

    @FindBy (xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettings;

    @FindBy (xpath = "//div[.='Grid Settings']")
    public WebElement isDisplayGrid;

    @FindBy (xpath = "//span[@class='close']")
    public WebElement close;


    @FindBy(css = "div[class='column-manager dropdown']")
    private WebElement isGridSettingButtonOfTheVytruckInTheRightPage;
    public boolean isGridSettingButtonOfTheVytruckInTheRightPage(){
        int x = isGridSettingButtonOfTheVytruckInTheRightPage.getLocation().getX();
        int y = isGridSettingButtonOfTheVytruckInTheRightPage.getLocation().getY();
        return x > y;
    }

    public void login(){
        username.sendKeys("user171");
        password.sendKeys("UserUser123");
        loginBtn.click();

    }


    public void login2(){
        Driver.getDriver().get(ConfigurationReader.getProperty("log"));
        Driver.getDriver().get(ConfigurationReader.getProperty("password12"));
        loginBtn.click();
    }
}
