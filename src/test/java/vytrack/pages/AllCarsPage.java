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

    @FindBy(xpath = "//a[@title='Refresh']")
    public WebElement refreshBtn;



    public boolean isGridSettingBtnRightOfResetBtn(){
        int x = refreshBtn.getLocation().getX();
        int y = resetBtn.getLocation().getY();

        if (x>y){
            return false;
        }else
            return true;
    }

    public boolean isRefreshBtnLeftOfReset() {

        int x1 = refreshBtn.getLocation().getX();
        int x2 = resetBtn.getLocation().getY();

        if (x1 > x2) {
            return true;
        } else
            return false;
    }


}
