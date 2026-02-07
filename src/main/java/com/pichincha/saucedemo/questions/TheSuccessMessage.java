package com.pichincha.saucedemo.questions;

import com.pichincha.saucedemo.userinterfaces.SauceCheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class TheSuccessMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(SauceCheckoutPage.CONTINUE_BUTTON),
                Click.on(SauceCheckoutPage.FINISH_BUTTON));
        return Text.of(SauceCheckoutPage.THANK_YOU_HEADER).answeredBy(actor);
    }

    public static TheSuccessMessage is(){
        return new TheSuccessMessage();
    }
}
