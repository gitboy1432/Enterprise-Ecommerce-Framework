package utils;



import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class WaitUtils {

        public static WebElement waitForElementVisible(By locator) {

            WebDriverWait wait =
                    new WebDriverWait(
                            DriverFactory.getDriver(),
                            Duration.ofSeconds(
                                    Integer.parseInt(
                                            ConfigReader.getProperty("explicitWait"))));

            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator));
        }

        public static WebElement waitForElementClickable(By locator) {

            WebDriverWait wait =
                    new WebDriverWait(
                            DriverFactory.getDriver(),
                            Duration.ofSeconds(
                                    Integer.parseInt(
                                            ConfigReader.getProperty("explicitWait"))));

            return wait.until(
                    ExpectedConditions.elementToBeClickable(locator));
        }
    }

