package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dashboardpage {
    public Dashboardpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='userId']")
    public WebElement userIdText;

    @FindBy(id = "init-app-menu")
    public WebElement appMenu;

    @FindBy(xpath = "//h3[text()='Sistem']")
    public WebElement systemButton;

    @FindBy(xpath = "//h3[text()='Ortak Tanımlar']")
    public WebElement commonDefinitionsButton;

    @FindBy(xpath = "//h3[text()='Tatil Günleri']")
    public WebElement vacationDaysButton;

    @FindBy(id = "TASPxRoundPanel1_xlbHeader")
    public WebElement vacationDaysText;
}
