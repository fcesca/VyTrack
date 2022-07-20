package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import vytrack.pages.AllCarsPage;

import vytrack.pages.BasePageUser;
import vytrack.pages.LoginPage;

public class RefreshBtnLocation {

    LoginPage loginPage = new LoginPage();
    AllCarsPage allCarsPage = new AllCarsPage();
    UserLogin userLogin = new UserLogin();
    BasePageUser basePageUser = new BasePageUser();



    @Given("That user is on the {string} page under fleet module")
    public void that_user_is_on_the_page_under_fleet_module(String Vehicles) {
        userLogin.user_is_on_vy_track_login_page();
        loginPage.inputUsername.sendKeys("User171");
        loginPage.inputPassword.sendKeys("UserUser123");
        loginPage.loginBtn.click();
        basePageUser.fleetDropdown.click();
        basePageUser.vehiclesModelBtn.click();


    }
    @Then("user should be able to see Refresh on the left side of the Reset button")
    public void user_should_be_able_to_see_refresh_on_the_left_side_of_the_reset_button() {
        Assert.assertTrue(allCarsPage.isRefreshBtnLeftOfReset());
    }
}
