package stepDefinitions;

import pages.Dashboardpage;
import pages.LoginPage;
import utilities.ReusableMethods;

public class BaseStep {
   protected LoginPage loginPage=new LoginPage();
   protected Dashboardpage dashboardpage=new Dashboardpage();
   protected ReusableMethods reusableMethods=new ReusableMethods();

}
