package tests;

import framework.drivers.DriverFactory;
import framework.utils.ConfigReader;
import framework.utils.ScreenshotUtil;
import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.get("browser");
        driver = DriverFactory.initializeDriver(browser);
        driver.get(ConfigReader.get("baseUrl"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Attachment(
            value = "Failure Screenshot",
            type = "image/png"
    )
    public byte[] attachScreenshot() {

        return ScreenshotUtil.takeScreenshot(driver);
    }
}
