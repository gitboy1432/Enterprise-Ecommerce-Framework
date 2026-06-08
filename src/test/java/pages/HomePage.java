package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class HomePage {
    WebDriver driver;

    public HomePage(){
        this.driver= DriverFactory.getDriver();
    }

    By lgnbtn= By.xpath("//a[contains(text(),'Signup / Login')]");

    public void clickLoginSignUp(){
        WaitUtils.waitForElementClickable(lgnbtn).click();
    }
}
