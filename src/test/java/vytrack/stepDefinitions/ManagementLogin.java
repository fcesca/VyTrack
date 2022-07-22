package vytrack.stepDefinitions;


import vytrack.pages.LoginPage;
import vytrack.utilities.ConfigurationReader;
import vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import vytrack.utilities.BrowserUtils;

public class ManagementLogin {

    LoginPage loginPage = new LoginPage();


    @Given("user is on VyTrack login page")
    public void user_is_on_vy_track_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("manager enters username {string}")
    public void manager_enters_username(String string) {
        loginPage.inputUsername.sendKeys("storemanager204");

    }

    @When("manager enters password {string}")
    public void manager_enters_password(String string) {
        loginPage.inputPassword.sendKeys("UserUser123");
    }

    @When("manager clicks login button")
    public void manager_clicks_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("manager should see VyTrack {string} page")
    public void managerShouldSeeVyTrackPage(String title) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(loginPage.getTitle(), title);
    }
}