package com.pichincha.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceInventoryPage {

    public static final Target ADD_TO_CART_BACKPACK = Target.the("Backpack").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADD_TO_CART_BIKE_LIGHT = Target.the("Bike Light").located(By.id("add-to-cart-sauce-labs-bike-light"));
}
