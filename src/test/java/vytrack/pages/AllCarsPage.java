package vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.Driver;
import org.openqa.selenium.Point;


public class AllCarsPage {

    public AllCarsPage() {
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

    @FindBy(id = "main-menu")
    public WebElement mainMenu;


    public boolean isGridSettingBtnRightOfResetBtn() {
        WebElement elementReset = resetBtn;
        WebElement elementGridSet = gridSettingsBtn;

        Point pointReset = elementReset.getLocation();
        Point pointGridSet = elementGridSet.getLocation();

        System.out.println("Reset Button Position from left side is: " + pointReset.getX() + " pixels.");
        System.out.println("Grid Setting Button Position from Left side is: " + pointGridSet.getX() + " pixels.");

        if (pointGridSet.getX() > pointReset.getX()) {
            return true;
        } else return false;
    }
}
