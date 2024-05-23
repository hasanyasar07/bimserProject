package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(id="cbCompany_B-1Img")
    private WebElement companyDropdownTable;

    @FindBy(xpath = "//tr[@class='dxeListBoxItemRow']")
    private List<WebElement> companyDropdownList;

    @FindBy(id="teUser_I")
    private WebElement userName;

    @FindBy(id="PV_I")
    private WebElement password;

    @FindBy(id="btn_CD")
    private WebElement loginButton;

    @FindBy(id = "xppcProcurationList_xrblProcurationList_RB0_I_D")
    private WebElement beamSystemAdministratorRadioButton;

    @FindBy(id = "xppcProcurationList_xbtnContinue_CD")
    private WebElement continueButton;

    @FindBy(xpath ="//span[@id='xmmMessage']")
    private WebElement incorrectMessage;

    @FindBy(id = "MessageBox1_xpcMsgBox_xbtnOK_CD")
    private WebElement incorrectMessageButton;

    public WebElement getCompanyDropdownTable() {
        return companyDropdownTable;
    }

    public List<WebElement> getCompanyDropdownList() {
        return companyDropdownList;
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getBeamSystemAdministratorRadioButton() {
        return beamSystemAdministratorRadioButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getIncorrectMessage() {
        return incorrectMessage;
    }

    public WebElement getIncorrectMessageButton() {
        return incorrectMessageButton;
    }
}
