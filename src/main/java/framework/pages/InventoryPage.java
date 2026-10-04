package framework.pages;

import framework.base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends basePage {

    private final By pageTitle =
            By.cssSelector(".title");

    private final By addToCartButton =
            By.id("add-to-cart-sauce-labs-backpack");

    private final By shoppingCart =
            By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return getText(pageTitle);
    }

    public void addBackpackToCart() {
        click(addToCartButton);
    }

    public void openCart() {
        click(shoppingCart);
    }
}
