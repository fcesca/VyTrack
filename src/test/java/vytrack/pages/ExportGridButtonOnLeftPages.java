package vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import vytrack.utilities.BrowserUtils;
import vytrack.utilities.Driver;

public class ExportGridButtonOnLeftPages {

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleet;

    public void vehicleBtnClick(String vehicles) {
        BrowserUtils.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//a/span[. = '" + vehicles + "']")).click();
        BrowserUtils.waitFor(2);
    }

    public void fleetBtnClick() {
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
        BrowserUtils.waitFor(2);
        fleet.click();
        BrowserUtils.waitFor(2);
    }

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-1761582304\"]/div[2]/div[1]/div/div[2]/div[2]/div/div/a")
    public WebElement exportGridBtn;

    public boolean isExportGridOnTheLeft(){
        int x1 = exportGridBtn.getLocation().getX();
        int x2 = 300;

        if (x1<x2){
            return true;
        } else{
            return false;
        }
    }











}
