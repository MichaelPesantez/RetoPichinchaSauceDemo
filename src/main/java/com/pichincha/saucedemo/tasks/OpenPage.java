package com.pichincha.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {

    public static Task open() { return instrumented(OpenPage.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }
}
