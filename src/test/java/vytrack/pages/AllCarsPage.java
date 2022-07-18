package vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.Driver;

public class AllCarsPage {

    public AllCarsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@title,'export')]")
    public WebElement exportGridBtn;

    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement csvBtn;

    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement xlsxBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsBtn;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(css = "div[class='column-manager dropdown']")
    private WebElement gridSettingBtnRightOfResetBtn;

    public boolean isGridSettingBtnRightOfResetBtn(){
        int x = gridSettingBtnRightOfResetBtn.getLocation().getX();
        int y = gridSettingBtnRightOfResetBtn.getLocation().getY();
        if (x>y){
            return false;
        }else return true;
    }
}