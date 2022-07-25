package vytrack.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import vytrack.pages.Madina_Aleksandra;
import vytrack.utilities.BrowserUtils;
import vytrack.utilities.Driver;

public class GridSettingsButtonClick {
    Madina_Aleksandra loginHomework = new Madina_Aleksandra();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();



    @Given("uer is on the Vehicles \\(Cars) page")
    public void uer_is_on_the_vehicles_cars_page(){
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

        loginHomework.login();
        loginHomework.fleet.click();
        loginHomework.vehicles.click();
        BrowserUtils.waitFor(3);
        loginHomework.isDisplaCar.isDisplayed();

    }
    @When("user click to Grid Settings button")
    public void user_click_to_grid_settings_button(){
        loginHomework.gridSettings.click();
        loginHomework.close.click();
        BrowserUtils.waitFor(3);

    }

    @Then("user should be see Grid Setting of drag and drop")
    public void user_should_be_see_grid_setting_of_drag_and_drop() {
        //Point po = loginHomework.gridSettings.getLocation();
        //  System.out.println(po.x);
        //System.out.println(po.y);
        System.out.println("loginHomework.isGridSettingButtonOfTheVytruckInTheRightPage() = " + loginHomework.isGridSettingButtonOfTheVytruckInTheRightPage());

    }
}
