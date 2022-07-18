package vytrack.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import vytrack.pages.AllCarsPage;
import vytrack.pages.LoginPage;
import vytrack.pages.Refresh;
import vytrack.utilities.BrowserUtils;

public class ExportGridDropdown {

    LoginPage loginPage = new LoginPage();
    ManagementLogin managementLogin = new ManagementLogin();
    Refresh refresh = new Refresh();
    AllCarsPage allCarsPage = new AllCarsPage();

    @Given("That user is logged in")
    public void that_user_is_logged_in() {
        managementLogin.user_is_on_vy_track_login_page();
        loginPage.inputUsername.sendKeys("storemanager204");
        loginPage.inputPassword.sendKeys("UserUser123");
        managementLogin.manager_clicks_login_button();

    }
    @And("user is on the {string} Page under Fleet Module")
    public void user_is_on_the_page_under_fleet_module(String vehicles) {
        refresh.fleetBtnClick();
        refresh.vehicleBtnClick(vehicles);
    }
    @Then("user should be able to click Export Grid Dropdown")
    public void user_should_be_able_to_click_export_grid_dropdown() {
        BrowserUtils.waitFor(2);
        allCarsPage.exportGridBtn.click();

        Assert.assertTrue(allCarsPage.csvBtn.isDisplayed());
        Assert.assertTrue(allCarsPage.xlsxBtn.isDisplayed());
    }
}
