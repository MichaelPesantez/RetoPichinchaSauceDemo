package com.pichincha.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceCartPage {

    public static final Target CART_ICON = Target.the("Carrito").located(By.className("shopping_cart_link"));
    public static final Target CHECKOUT_BUTTON = Target.the("Boton Checkout").located(By.id("checkout"));
}
