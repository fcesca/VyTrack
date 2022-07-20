package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import vytrack.pages.AllCarsPage;
import vytrack.pages.BasePage;
import vytrack.pages.LoginPage;
import vytrack.utilities.BrowserUtils;
import vytrack.utilities.ConfigurationReader;
import vytrack.utilities.Driver;

public class RefreshBtnAzizAndAlexey {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    AllCarsPage allCarsPage = new AllCarsPage();



    @Given("user is logging in to VyTrack page")
    public void user_is_logging_in_to_vy_track_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login("storemanager204", "UserUser123");
    }
    @When("user clicking on Fleet dropdown menu")
    public void user_clicking_on_fleet_dropdown_menu() {
        basePage.fleetDropdown.click();

    }
    @When("choose {string} option")
    public void choose_option(String string) {
        Driver.getDriver().findElement(By.xpath("//a/span[. = '" + string + "']")).click();
    }
    @When("user clicks Refresh button")
    public void user_clicks_refresh_button() {
 //       allCarsPage.refreshButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("user should be able to refresh page")
    public void user_should_be_able_to_refresh_page() {

    }
}
