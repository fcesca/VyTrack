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
    public WebElement allVehiclesModelSubtitle;

    @FindBy(xpath = "(//a[@href='#']/i)[10]")
    public WebElement gridSettingsBtn;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[1]")
    public WebElement idCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[2]")
    public WebElement modelNameCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[3]")
    public WebElement makeCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[4]")
    public WebElement canBeRequestedCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[5]")
    public WebElement catalogueValueCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[6]")
    public WebElement cO2FeeCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[7]")
    public WebElement costCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[8]")
    public WebElement totalCostCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[9]")
    public WebElement cO2EmissionsCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[10]")
    public WebElement fuelTypeCheckbox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[11]")
    public WebElement vendorsCheckbox;
}
