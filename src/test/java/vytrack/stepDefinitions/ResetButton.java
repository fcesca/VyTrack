package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import vytrack.pages.AllCarsPage;
import vytrack.pages.LoginPage;
import vytrack.pages.Refresh;


public class ResetButton {

    LoginPage loginPage = new LoginPage();
    ManagementLogin managementLogin = new ManagementLogin();
    AllCarsPage allCarsPage = new AllCarsPage();
    Refresh refresh = new Refresh();

    @Given("User is on the {string} Page")
    public void user_is_on_the_vehicles_page(String vehicles) {
        managementLogin.user_is_on_vy_track_login_page();
        loginPage.inputUsername.sendKeys("storemanager204");
        loginPage.inputPassword.sendKeys("UserUser123");
        managementLogin.manager_clicks_login_button();

        refresh.fleetBtnClick();
        refresh.vehicleBtnClick(vehicles);
    }
    @Then("the user should be able to click the Reset Page Button")
    public void the_user_should_be_able_to_click_the_reset_page_button() {
        Assert.assertTrue(allCarsPage.resetBtn.isEnabled());
    }
}
