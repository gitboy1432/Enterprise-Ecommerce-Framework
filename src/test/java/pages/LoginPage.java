package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
       this.driver = DriverFactory.getDriver();
    }
    By emailBox= By.xpath("//input[contains(@name,'email')]");
    By passwordBox=By.xpath("//input[contains(@name,'password')]");
    By loginBtn=By.xpath("//button[contains(text(),'Login')]");


    public void enterUsername(String email){
        driver.findElement(emailBox).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(passwordBox).sendKeys(password);
    }

    public void clickLoginbtn(){
        driver.findElement(loginBtn).click();
    }
}
