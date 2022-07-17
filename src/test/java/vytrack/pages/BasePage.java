package vytrack.pages;

import vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboardTitle;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetDropdown;

    @FindBy(linkText = "/entity/Extend_Entity_VehiclesModel")
    public WebElement vehiclesModelBtn;
}
