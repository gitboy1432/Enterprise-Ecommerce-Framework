package tests;



import base.BaseTest;
import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import pages.LoginPage;
import utils.ConfigReader;


import base.DriverFactory;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest {

    @Test
    public void LaunchBrowser() {
        System.out.println(
                DriverFactory.getDriver().getTitle());
        HomePage signUp= new HomePage();
        signUp.clickLoginSignUp();
        DriverFactory.quitDriver();
    }

    @Test
    public void LoginProcess() throws InterruptedException {
    HomePage hp= new HomePage();
      hp.clickLoginSignUp();

        LoginPage lp= new LoginPage();
        lp.enterUsername("prajapatprince1432@gmail.com");
        lp.enterPassword("ExcerciseAutomation123@");
        lp.clickLoginbtn();
    }

}