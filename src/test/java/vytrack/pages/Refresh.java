package vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import vytrack.utilities.BrowserUtils;
import vytrack.utilities.Driver;

public class Refresh {

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleet;

    @FindBy(xpath = "//div//h1[normalize-space(.) = '\"+allCars+\"']")
    public static WebElement title;

    @FindBy(xpath = "(//div[@class='actions-panel pull-right form-horizontal']//a)[2]")
    private static WebElement refreshButton;

    public String allCarsTitleClick(String allCars) {
        BrowserUtils.waitFor(2);
        WebElement title = Driver.getDriver().findElement(By.xpath("//div//h1[normalize-space(.) = '" + allCars + "']"));
        return title.getText();
    }

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

    public static boolean refreshIsDisplayed() {
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("(//div[@class='actions-panel pull-right form-horizontal']//a)[2]"));
        BrowserUtils.waitFor(2);
        return refreshButton.isDisplayed();
    }

    public static void refreshButtonClick() {
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("(//div[@class='actions-panel pull-right form-horizontal']//a)[2]"));
        BrowserUtils.waitFor(2);
        refreshButton.click();
        BrowserUtils.waitFor(2);
    }

    public static boolean titleIsDisplayed() {
        WebElement title = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[1]/div/div/div/div[1]/div/h1"));
        BrowserUtils.waitFor(2);
        return title.isDisplayed();
    }

}



/*
package vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import vytrack.utilities.BrowserUtils;
import vytrack.utilities.Driver;

public class Refresh {

    @FindBy(xpath = "//a/span[normalize-space(.) = '\"+fleet+\"']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//div//h1[normalize-space(.) = '\"+allCars+\"']")
    public static WebElement allCarsTitle;

    @FindBy(xpath = "(//div[@class='actions-panel pull-right form-horizontal']//a)[2]")
    private static WebElement refreshButton;



//    @FindBy(xpath = "//div//h1[normalize-space(.) = '"+allCars+"']")
//    private static WebElement title;


    public String allCarsTitleClick(String allCars) {
        BrowserUtils.waitFor(5);
        WebElement title = Driver.getDriver().findElement(By.xpath("//div//h1[normalize-space(.) = '" + allCars + "']"));
        return title.getText();

    }

    public void vehicleBtnClick(String vehicles) {
        Driver.getDriver().findElement(By.xpath("//a/span[. = '" + vehicles + "']")).click();
        BrowserUtils.waitFor(5);
    }

    public void fleetBtnClick() {

        BrowserUtils.waitFor(2);
        fleetBtn.click();
        BrowserUtils.waitFor(3);
    }

    public static boolean refreshIsDisplayed() {
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("(//div[@class='actions-panel pull-right form-horizontal']//a)[2]"));
        BrowserUtils.waitFor(2);
        return refreshButton.isDisplayed();
    }

    public void refreshButtonClick() {

        BrowserUtils.waitFor(2);
        refreshButton.click();
        BrowserUtils.waitFor(2);
    }

}
 */
