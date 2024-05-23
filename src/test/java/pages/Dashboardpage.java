package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dashboardpage extends BasePage {


    @FindBy(xpath = "//a[@id='userId']")
    private WebElement userIdText;

    @FindBy(id = "init-app-menu")
    private WebElement appMenu;

    @FindBy(xpath = "//h3[text()='Sistem']")
    private WebElement systemButton;

    @FindBy(xpath = "//h3[text()='Ortak Tanımlar']")
    private WebElement commonDefinitionsButton;

    @FindBy(xpath = "//h3[text()='Tatil Günleri']")
    private WebElement vacationDaysButton;

    @FindBy(id = "TASPxRoundPanel1_xlbHeader")
    private WebElement vacationDaysText;

    public WebElement getUserIdText(){
        return userIdText;
    }

    public WebElement getAppMenu() {
        return appMenu;
    }

    public WebElement getCommonDefinitionsButton() {
        return commonDefinitionsButton;
    }

    public WebElement getVacationDaysButton() {
        return vacationDaysButton;
    }

    public WebElement getVacationDaysText() {
        return vacationDaysText;
    }

    public WebElement getSystemButton() {
        return systemButton;
    }
}
