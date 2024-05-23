package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Dashboardpage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Dashboard extends BaseStep{


    @Given("Click the Application Menu")
    public void click_the_application_menu() {
        ReusableMethods.wait(2);
        dashboardpage.getAppMenu().click();
        ReusableMethods.wait(2);
    }
    @Given("Click the System button")
    public void click_the_system_button() {
        dashboardpage.getSystemButton().click();
        ReusableMethods.wait(2);
    }
    @Given("Click the Common Definitions button")
    public void click_the_common_definitions_button() {
        dashboardpage.getCommonDefinitionsButton().click();
        ReusableMethods.wait(2);
    }
    @Given("Click Vacation Days button")
    public void click_vacation_days_button() {
        dashboardpage.getVacationDaysButton().click();
    }
    @Given("Confirm that Vacation Days page is visible")
    public void confirm_that_vacation_days_page_is_visible() {
        ReusableMethods.wait(2);
        Driver.getDriver().switchTo().frame("mainFrame");
        Assert.assertTrue(dashboardpage.getVacationDaysText().isDisplayed());
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }
}
