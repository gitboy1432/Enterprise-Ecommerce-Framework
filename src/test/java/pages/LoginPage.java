package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
       this.driver = DriverFactory.getDriver();
    }
    By emailBox= By.xpath("//input[contains(@name,'email')]");
    By passwordBox=By.xpath("//input[contains(@name,'password')]");
    By loginBtn=By.xpath("//button[contains(text(),'Login')]");
By afterLogin=By.xpath("//i[@class='fa fa-user']/following-sibling::b");

    public void enterUsername(String email){
        driver.findElement(emailBox).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(passwordBox).sendKeys(password);
    }

    public void clickLoginbtn(){
        driver.findElement(loginBtn).click();
      String lgdusrName=  driver.findElement(afterLogin).getText();
 Assert.assertEquals(lgdusrName,"prajapatprince1432@gmail.com");
 }
    }

