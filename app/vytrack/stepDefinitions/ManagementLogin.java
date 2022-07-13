package app.vytrack.stepDefinitions;

import app.vytrack.pages.BasePage;
import app.vytrack.pages.LoginPage;
import app.vytrack.utilities.ConfigurationReader;
import app.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagementLogin {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

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

    @Then("manager should see VyTrack Dashboard page")
    public void manager_should_see_vy_track_dashboard_page() {
        Assert.assertEquals("Title verification is failed!","Dashboard",loginPage.dashboardTitle.getText());
    }
}
