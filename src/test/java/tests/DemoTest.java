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
import utils.TestDataProvider;

public class DemoTest extends BaseTest {






        @Test
        public void verifyLoginPageNavigation() {

            HomePage homePage = new HomePage();

            homePage.clickLoginSignUp();

            Assert.assertTrue( DriverFactory.getDriver().getCurrentUrl().contains("login"), "Login page not opened");
        }


    @Test(dataProvider = "loginData",
    dataProviderClass = TestDataProvider .class)
    public void LoginProcess(String email,String pass) throws InterruptedException {
    HomePage hp= new HomePage();
      hp.clickLoginSignUp();

        LoginPage lp= new LoginPage();
        lp.enterUsername(email);
        lp.enterPassword(pass);
        lp.clickLoginbtn();
    }
}
