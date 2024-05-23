package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.Dashboardpage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class Login {

    private static final Logger log = LoggerFactory.getLogger(Login.class);
    LoginPage loginPage=new LoginPage();
    Dashboardpage dashboardpage=new Dashboardpage();


    @Given("Goes to the given {string}")
    public void goes_to_the_given(String url) {
        ReusableMethods.navigateToTheRequestedUrl(url);
    }

    @Given("Select the correct {string}, enter the correct {string} and {string}")
    public void select_the_correct_enter_the_correct_and(String company, String username, String password) {
        ReusableMethods.wait(2);
        loginPage.companyDropdownTable.click();
        ReusableMethods.wait(2);
        List<WebElement> companies=loginPage.companyDropdownList;
        for (WebElement comp:companies){
            if(comp.getText().equalsIgnoreCase(ReusableMethods.getCompany(company))){
                comp.click();
            }
        }
        ReusableMethods.wait(1);
        loginPage.userName.sendKeys(ReusableMethods.getUsername(username));
        ReusableMethods.wait(1);
        loginPage.password.sendKeys((ReusableMethods.getPassword(password)));
        ReusableMethods.wait(1);

    }
    @Given("Click the Login button")
    public void click_the_login_button() {
        loginPage.loginButton.click();
    }
    @Given("Click the BEAM SYSTEM ADMINISTRATOR radio button")
    public void click_the_beam_system_administrator_radio_button() {
        loginPage.beamSystemAdministratorRadioButton.click();
        ReusableMethods.wait(1);

    }
    @Given("Click the Continue button")
    public void click_the_continue_button() {
        loginPage.continueButton.click();
    }
    @Given("Confirm that the text {string} is visible")
    public void confirm_that_the_text_is_visible(String text) {
        ReusableMethods.wait(1);
        Assert.assertTrue(dashboardpage.userIdText.getText().equalsIgnoreCase(text));
        System.out.println("Positive login test success");
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }

    //Negative login test
    @Given("Select the correct {string}, enter the correct {string} and incorrect {string}")
    public void select_the_correct_enter_the_correct_and_incorrect(String company, String username, String incorrectPassword) {
        ReusableMethods.wait(2);
        loginPage.companyDropdownTable.click();
        ReusableMethods.wait(2);
        List<WebElement> companies=loginPage.companyDropdownList;
        for (WebElement comp:companies){
            if(comp.getText().equalsIgnoreCase(ReusableMethods.getCompany(company))){
                comp.click();
            }
        }
        ReusableMethods.wait(1);
        loginPage.userName.sendKeys(ReusableMethods.getUsername(username));
        ReusableMethods.wait(1);
        loginPage.password.sendKeys((ReusableMethods.getPassword(incorrectPassword)));
        ReusableMethods.wait(1);
    }
    @Given("Confirm that incorrect message is {string}")
    public void confirm_that_incorrect_message_is(String message) {
        ReusableMethods.wait(1);
        Assert.assertTrue(loginPage.incorrectMessage.getText().equalsIgnoreCase(message));
        loginPage.incorrectMessageButton.click();
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }

    @Given("Select the correct {string}, enter the incorrect {string} and correct {string}")
    public void select_the_correct_enter_the_incorrect_and_correct(String company, String incorrectUsername, String password) {
        ReusableMethods.wait(2);
        loginPage.companyDropdownTable.click();
        ReusableMethods.wait(2);
        List<WebElement> companies=loginPage.companyDropdownList;
        for (WebElement comp:companies){
            if(comp.getText().equalsIgnoreCase(ReusableMethods.getCompany(company))){
                comp.click();
            }
        }
        ReusableMethods.wait(1);
        loginPage.userName.sendKeys(ReusableMethods.getUsername(incorrectUsername));
        ReusableMethods.wait(1);
        loginPage.password.sendKeys((ReusableMethods.getPassword(password)));
        ReusableMethods.wait(1);
    }

    @Given("Select the correct {string}, enter the incorrect {string} and {string}")
    public void select_the_correct_enter_the_incorrect_and(String company, String incorrectUsername, String incorrectPassword) {
        ReusableMethods.wait(2);
        loginPage.companyDropdownTable.click();
        ReusableMethods.wait(2);
        List<WebElement> companies=loginPage.companyDropdownList;
        for (WebElement comp:companies){
            if(comp.getText().equalsIgnoreCase(ReusableMethods.getCompany(company))){
                comp.click();
            }
        }
        ReusableMethods.wait(1);
        loginPage.userName.sendKeys(ReusableMethods.getUsername(incorrectUsername));
        ReusableMethods.wait(1);
        loginPage.password.sendKeys((ReusableMethods.getPassword(incorrectPassword)));
        ReusableMethods.wait(1);
    }

    @Given("Select the incorrect {string}, enter the correct {string} and {string}")
    public void select_the_incorrect_enter_the_correct_and(String company, String username, String password) {
        ReusableMethods.wait(2);
        loginPage.companyDropdownTable.click();
        ReusableMethods.wait(2);
        List<WebElement> companies=loginPage.companyDropdownList;
        for (WebElement comp:companies){
            if(comp.getText().equalsIgnoreCase(company)){
                comp.click();
            }
        }
        ReusableMethods.wait(1);
        loginPage.userName.sendKeys(ReusableMethods.getUsername(username));
        ReusableMethods.wait(1);
        loginPage.password.sendKeys((ReusableMethods.getPassword(password)));
        ReusableMethods.wait(1);
    }


}
