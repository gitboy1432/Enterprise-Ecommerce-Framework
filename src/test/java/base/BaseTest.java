package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {

//    this will run automatically and get the assigned driver from configReader
    @BeforeMethod
    public void setup(){
        DriverFactory.initDriver();
     WebDriver driver=  DriverFactory.getDriver();
     driver.get(ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
