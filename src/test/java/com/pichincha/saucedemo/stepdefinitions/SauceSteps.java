package com.pichincha.saucedemo.stepdefinitions;

import com.pichincha.saucedemo.questions.TheSuccessMessage;
import com.pichincha.saucedemo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class SauceSteps {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("que el usuario abre la pagina SauceDemo")
    public void que_el_usuario_abre_la_pagina_sauce_demo() { theActorCalled("User")
            .attemptsTo(OpenPage.open()); }

    @And("se loguea con {word} {word}")
    public void se_loguea_con(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(
                Login.conCredenciales(user, pass)
        );
    }

    @And("agrega productos al carrito")
    public void agrega_productos_al_carrito() {
        theActorInTheSpotlight().attemptsTo(AddProducts.alCarrito());
    }

    @And("visualiza el carrito")
    public void visualizaCar(){
        theActorInTheSpotlight().attemptsTo(
                ViewCart.verCarrito()
        );
    }

    @When("completa el formulario de compra con sus datos: {word} {word} {word}")
    public void finalizaLaCompraConSusDatos(String fname, String lname, String pass) {
        theActorInTheSpotlight().attemptsTo(CompletePurchase.conDatos(fname, lname, pass));
    }

    @Then("el sistema muestra {string}")
    public void validarMensajeExito(String msj) {
        theActorInTheSpotlight().should(seeThat(TheSuccessMessage.is(),equalToIgnoringCase(msj)));
    }
}