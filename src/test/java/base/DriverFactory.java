package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigReader;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {

        String browser =
                ConfigReader.getProperty("browser");

        switch (browser.toLowerCase()) {

            case "firefox":

                driver.set(new FirefoxDriver());
                break;

            case "edge":

                driver.set(new EdgeDriver());
                break;

            default:

                driver.set(new ChromeDriver());
                break;
        }

        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {

            driver.get().quit();

            driver.remove();
        }
    }
}