package com.pichincha.saucedemo.tasks;

import com.pichincha.saucedemo.userinterfaces.SauceInventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProducts implements Task {

    public static AddProducts alCarrito() {
        return instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(SauceInventoryPage.ADD_TO_CART_BACKPACK, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SauceInventoryPage.ADD_TO_CART_BACKPACK),

                WaitUntil.the(SauceInventoryPage.ADD_TO_CART_BIKE_LIGHT, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SauceInventoryPage.ADD_TO_CART_BIKE_LIGHT)

        );
    }
}