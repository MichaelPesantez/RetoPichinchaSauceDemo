package com.pichincha.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceHomePage {
    public static final Target USERNAME = Target.the("Usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Botón Login").located(By.id("login-button"));
}