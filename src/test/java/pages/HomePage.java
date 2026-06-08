package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(){
        this.driver= DriverFactory.getDriver();
    }

    By lgnbtn= By.xpath("//a[contains(text(),'Signup / Login')]");

    public void clickLoginSignUp(){
        driver.findElement(lgnbtn).click();
    }
}
