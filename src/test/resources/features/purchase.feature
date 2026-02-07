Feature: Compra de productos en SauceDemo

  Scenario Outline: Flujo de compra exitoso
    Given que el usuario abre la pagina SauceDemo
    And se loguea con <user> <pass>
    And agrega productos al carrito
    And visualiza el carrito
    When completa el formulario de compra con sus datos: <firstName> <lastName> <zipCode>
    Then el sistema muestra "Thank you for your order!"

    Examples:
      | user          | pass         | firstName | lastName   | zipCode |
      | standard_user | secret_sauce | Michael   | Pesantez   | 170105  |