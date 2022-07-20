package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import vytrack.pages.LoginPage;
import vytrack.utilities.BrowserUtils;
import vytrack.utilities.ConfigurationReader;
import vytrack.utilities.Driver;

public class UserLogin {
    LoginPage loginPage = new LoginPage();

    @Given("user is on VyTrack login page")
    public void user_is_on_vy_track_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.inputUsername.sendKeys("User171");
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.inputPassword.sendKeys("UserUser123");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("user should be able to see Vytrack {string} page")
    public void user_should_be_able_to_see_vytrack_page(String title) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(loginPage.getTitle(), title);
    }


}
