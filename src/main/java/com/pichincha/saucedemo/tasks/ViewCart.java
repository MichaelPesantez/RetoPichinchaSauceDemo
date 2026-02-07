package com.pichincha.saucedemo.tasks;

import com.pichincha.saucedemo.userinterfaces.SauceCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewCart implements Task {

    public static Task verCarrito() {
         return instrumented(ViewCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SauceCartPage.CART_ICON,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SauceCartPage.CART_ICON)
        );
    }
}
