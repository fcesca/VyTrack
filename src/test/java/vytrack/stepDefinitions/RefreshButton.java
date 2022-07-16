package vytrack.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import vytrack.pages.Refresh;
import vytrack.utilities.BrowserUtils;

public class RefreshButton {

    Refresh refresh = new Refresh();


    @When("User clicks to {string} option")
    public void user_clicks_to_option(String vehicles) {
        refresh.vehicleBtnClick(vehicles);
    }

    @Then("User is on the {string} page")
    public void user_is_on_the_page(String allCars) {
        refresh.allCarsTitleClick(allCars);
        BrowserUtils.waitFor(2);
    }

    @Then("User observes no changes on the All Cars page")
    public void userObservesNoChangesOnTheAllCarsPage() {
        Assert.assertTrue(Refresh.titleIsDisplayed());
    }

    @When("User clicks to Fleet dropdown")
    public void userClicksToFleetDropdown() {
        refresh.fleetBtnClick();
    }

    @When("User can see Refresh button")
    public void userCanSeeRefreshButton() {
        Assert.assertTrue(Refresh.refreshIsDisplayed());
    }

    @And("User clicks to Refresh button")
    public void userClicksToRefreshButton() {
        refresh.refreshButtonClick();
    }
}


/*
  @When("User clicks to {string} dropdown")
    public void user_clicks_to_dropdown(String fleet) {
        refresh.fleetBtnClick();
    }

    @When("User clicks to {string} option")
    public void user_clicks_to_option(String vehicles) {
        refresh.vehicleBtnClick(vehicles);
    }

    @Then("User is on the {string} page")
    public void user_is_on_the_page(String allCars) {
        refresh.allCarsTitleClick(allCars);
        BrowserUtils.waitFor(2);

    }

    @When("User can see {string} button")
    public void user_can_see_button(String refresh) {
        Assert.assertTrue(Refresh.refreshIsDisplayed());
    }

    @When("User clicks to {string} button")
    public void user_clicks_to_button(String string) {
        refresh.refreshButtonClick();
    }

    @Then("User observes no changes on the {string} page")
    public void user_observes_no_changes_on_the_page(String title) {
        Assert.assertTrue(Refresh.titleIsDisplayed());
    }

 */
