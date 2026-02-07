package com.pichincha.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceCheckoutPage {

    public static final Target FIRST_NAME = Target.the("Nombre").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Apellido").located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("Código Postal").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Boton Continuar").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("Boton Finalizar").located(By.id("finish"));

    public static final Target THANK_YOU_HEADER = Target.the("Header Gracias").located(By.className("complete-header"));

}
