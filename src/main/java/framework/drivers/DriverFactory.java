package framework.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initializeDriver(String browser) {
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                return driver;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                return driver;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                return driver;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
