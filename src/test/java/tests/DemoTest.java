package tests;



import base.BaseTest;
import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import pages.LoginPage;
import utils.ConfigReader;


import base.DriverFactory;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest {






        @Test
        public void verifyLoginPageNavigation() {

            HomePage homePage = new HomePage();

            homePage.clickLoginSignUp();

            Assert.assertTrue( DriverFactory.getDriver().getCurrentUrl().contains("login"), "Login page not opened");
        }


    @Test
    public void LoginProcess() throws InterruptedException {
    HomePage hp= new HomePage();
      hp.clickLoginSignUp();

        LoginPage lp= new LoginPage();
        lp.enterUsername("ExcerciseAutomation@123");
        lp.enterPassword("ExcerciseAutomation@123");
        lp.clickLoginbtn();
    }
}
