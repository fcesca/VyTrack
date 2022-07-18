package vytrack.stepDefinitions;

import vytrack.pages.AllVehiclesModelPage;
import vytrack.pages.BasePage;
import vytrack.pages.LoginPage;
import vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ManagementAccessVehiclesModel {

    ManagementLogin managementLogin = new ManagementLogin();
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    AllVehiclesModelPage allVehiclesModelPage = new AllVehiclesModelPage();

    @Given("That Store Manager or Sales Manager is logged in")
    public void that_store_manager_or_sales_manager_is_logged_in() {
        managementLogin.user_is_on_vy_track_login_page();
        loginPage.inputUsername.sendKeys("storemanager204");
        loginPage.inputPassword.sendKeys("UserUser123");
        managementLogin.manager_clicks_login_button();
    }
    @Given("on the dashboard")
    public void on_the_dashboard() {
        managementLogin.managerShouldSeeVyTrackPage("Dashboard");
    }
    @When("Store Manager or Sales Manager clicks on “Vehicles Model” in the “Fleet” dropdown menu")
    public void store_manager_or_sales_manager_clicks_on_vehicles_model_in_the_fleet_dropdown_menu() {
        BrowserUtils.waitFor(2);
        basePage.fleetDropdown.click();
        BrowserUtils.waitFor(2);
        basePage.vehiclesModelBtn.click();
    }
    @When("is directed to the page titled “All Vehicles Model”")
    public void is_directed_to_the_page_titled_all_vehicles_model() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue("All Vehicles Model", allVehiclesModelPage.allVehiclesModelSubtitle.isDisplayed());
    }
    @Then("verify that all Vehicle model information is displayed")
    public void verify_that_all_vehicle_model_information_is_displayed() {
    allVehiclesModelPage.gridSettingsBtn.click();
    allVehiclesModelPage.modelNameCheckbox.isSelected();
    allVehiclesModelPage.makeCheckbox.isSelected();
    allVehiclesModelPage.canBeRequestedCheckbox.isSelected();
    allVehiclesModelPage.catalogueValueCheckbox.isSelected();
    allVehiclesModelPage.cO2FeeCheckbox.isSelected();
    allVehiclesModelPage.costCheckbox.isSelected();
    allVehiclesModelPage.totalCostCheckbox.isSelected();
    allVehiclesModelPage.cO2EmissionsCheckbox.isSelected();
    allVehiclesModelPage.fuelTypeCheckbox.isSelected();
    allVehiclesModelPage.vendorsCheckbox.isSelected();
    }
}
