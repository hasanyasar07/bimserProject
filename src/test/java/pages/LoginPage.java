package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="cbCompany_B-1Img")
    public WebElement companyDropdownTable;

    @FindAll(@FindBy(xpath = "//tr[@class='dxeListBoxItemRow']"))
    public List<WebElement> companyDropdownList;

    @FindBy(id="teUser_I")
    public WebElement userName;

    @FindBy(id="PV_I")
    public WebElement password;

    @FindBy(id="btn_CD")
    public WebElement loginButton;

    @FindBy(id = "xppcProcurationList_xrblProcurationList_RB0_I_D")
    public WebElement beamSystemAdministratorRadioButton;

    @FindBy(id = "xppcProcurationList_xbtnContinue_CD")
    public WebElement continueButton;





}
