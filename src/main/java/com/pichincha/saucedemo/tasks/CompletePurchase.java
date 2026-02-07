package com.pichincha.saucedemo.tasks;

import com.pichincha.saucedemo.userinterfaces.SauceCartPage;
import com.pichincha.saucedemo.userinterfaces.SauceCheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletePurchase implements Task {
    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public CompletePurchase(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public static CompletePurchase conDatos(String nombre, String apellido, String zip) {
        return instrumented(CompletePurchase.class, nombre, apellido, zip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SauceCartPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SauceCartPage.CHECKOUT_BUTTON),
                Enter.theValue(firstName).into(SauceCheckoutPage.FIRST_NAME),
                Enter.theValue(lastName).into(SauceCheckoutPage.LAST_NAME),
                Enter.theValue(zipCode).into(SauceCheckoutPage.POSTAL_CODE)
        );
    }
}