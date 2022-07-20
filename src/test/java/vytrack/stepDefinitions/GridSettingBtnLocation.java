package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import vytrack.pages.AllCarsPage;
import vytrack.pages.LoginPage;
import vytrack.pages.Refresh;

public class GridSettingBtnLocation {

    LoginPage loginPage = new LoginPage();
    ManagementLogin managementLogin = new ManagementLogin();
    AllCarsPage allCarsPage = new AllCarsPage();
    Refresh refresh = new Refresh();

    @Given("That user is on the {string} Page under Fleet Module")
    public void that_user_is_on_the_page_under_fleet_module(String vehicles) {
        managementLogin.user_is_on_vy_track_login_page();
        loginPage.inputUsername.sendKeys("storemanager204");
        loginPage.inputPassword.sendKeys("UserUser123");
        managementLogin.manager_clicks_login_button();

        refresh.fleetBtnClick();
        refresh.vehicleBtnClick(vehicles);

    }
    @Then("user should be able to see Grid Settings on the right side of the Reset button")
    public void user_should_be_able_to_see_grid_settings_on_the_right_side_of_the_reset_button() {
        Assert.assertTrue(allCarsPage.isGridSettingBtnRightOfResetBtn());
    }
}