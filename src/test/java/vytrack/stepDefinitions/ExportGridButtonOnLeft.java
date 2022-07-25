package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import vytrack.pages.AllCarsPage;
import vytrack.pages.ExportGridButtonOnLeftPages;
import vytrack.pages.LoginPage;
import vytrack.pages.Refresh;

public class ExportGridButtonOnLeft {

    ExportGridButtonOnLeftPages gridButton = new ExportGridButtonOnLeftPages();
    LoginPage loginPage = new LoginPage();
    Refresh refresh = new Refresh();
    AllCarsPage allCarsPage = new AllCarsPage();

    @Given("that the user is on the Vehicles Page under Fleet Module")
    public void that_the_user_is_on_the_vehicles_page_under_fleet_module(String vehicles) {
        loginPage.login("storemanager204", "UserUser123");
        gridButton.fleetBtnClick();
        gridButton.vehicleBtnClick(vehicles);

    }
    @Then("the user should see the Export Grid dropdown on the left of the page")
    public void the_user_should_see_the_export_grid_dropdown_on_the_left_of_the_page() {
        Assert.assertTrue(gridButton.isExportGridOnTheLeft());
    }
}
