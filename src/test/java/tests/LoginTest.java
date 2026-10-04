package tests;

import framework.pages.InventoryPage;
import framework.pages.LoginPage;
import framework.utils.ConfigReader;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    @Step("Valid login with correct credentials")
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );

        InventoryPage inventoryPage =
                new InventoryPage(driver);

        Assert.assertEquals(
                inventoryPage.getPageTitle(),
                "Products",
                "Inventory page title mismatch"
        );
    }

    @Test
    @Step("Invalid login with incorrect credentials")
    public void invalidLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "invalid_user",
                "wrong_password"
        );

        Assert.assertTrue(
                loginPage.getErrorMessage()
                        .contains("Username and password do not match"),
                "Expected login error was not displayed"
        );
    }

    @Test
    public void addProductToCartTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );

        InventoryPage inventoryPage =
                new InventoryPage(driver);

        Assert.assertEquals(
                inventoryPage.getPageTitle(),
                "Products"
        );

        inventoryPage.addBackpackToCart();
        inventoryPage.openCart();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("cart.html"),
                "Cart page was not opened"
        );
    }
}
