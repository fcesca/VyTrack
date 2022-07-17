package vytrack.pages;

import vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllVehiclesModelPage {

    public AllVehiclesModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allVehicleModelSubtitle;

    @FindBy(xpath = "//div[@class=\'column-manager dropdown\']")
    public WebElement gridSettingsBtn;

    @FindBy(xpath = "//input[@id='column-c150']")
    public WebElement idCheckbox;

    @FindBy(xpath = "//input[@id='column-c151']")
    public WebElement modelNameCheckbox;

    @FindBy(xpath = "//input[@id='column-c152']")
    public WebElement makeCheckbox;

    @FindBy(xpath = "//input[@id='column-c153']")
    public WebElement canBeRequestedCheckbox;

    @FindBy(xpath = "//input[@id='column-c154']")
    public WebElement catalogueValueCheckbox;

    @FindBy(xpath = "//input[@id='column-c155']")
    public WebElement cO2FeeCheckbox;

    @FindBy(xpath = "//input[@id='column-c156']")
    public WebElement costCheckbox;

    @FindBy(xpath = "//input[@id='column-c157']")
    public WebElement totalCostCheckbox;

    @FindBy(xpath = "//input[@id='column-c158']")
    public WebElement cO2EmissionsCheckbox;

    @FindBy(xpath = "//input[@id='column-c159']")
    public WebElement fuelTypeCheckbox;

    @FindBy(xpath = "//input[@id='column-c160']")
    public WebElement vendorsCheckbox;
}
