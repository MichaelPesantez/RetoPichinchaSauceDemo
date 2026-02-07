package com.pichincha.saucedemo.tasks;

import com.pichincha.saucedemo.userinterfaces.SauceHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private final String user;
    private final String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Login conCredenciales(String username, String password) {
        return new Login(username, password);
    }

    @Override
    public<T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(SauceHomePage.USERNAME),
                Enter.theValue(pass).into(SauceHomePage.PASSWORD),
                Click.on(SauceHomePage.LOGIN_BUTTON)
        );
    }
}
