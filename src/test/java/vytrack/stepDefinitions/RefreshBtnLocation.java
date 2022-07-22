package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import vytrack.pages.AllCarsPage;

import vytrack.pages.BasePage;
import vytrack.pages.LoginPage;
import vytrack.pages.Refresh;

public class RefreshBtnLocation {

    LoginPage loginPage = new LoginPage();
    AllCarsPage allCarsPage = new AllCarsPage();
    ManagementLogin managementLogin = new ManagementLogin();
    BasePage basePage = new BasePage();
    Refresh refresh = new Refresh();



    @Given("That user is on the {string} page under fleet module")
    public void that_user_is_on_the_page_under_fleet_module(String Vehicles) {
        managementLogin.user_is_on_vy_track_login_page();
        loginPage.inputUsername.sendKeys("storemanager204");
        loginPage.inputPassword.sendKeys("UserUser123");
        managementLogin.manager_clicks_login_button();

        refresh.fleetBtnClick();
        refresh.vehicleBtnClick(Vehicles);


    }
    @Then("user should be able to see Refresh on the left side of the Reset button")
    public void user_should_be_able_to_see_refresh_on_the_left_side_of_the_reset_button() {
        Assert.assertTrue(allCarsPage.isRefreshBtnLeftOfReset());
    }
}
