Feature: Product-store
@examen

  @Escenario1
  Scenario: Validación el inicio de sesion
    Given estoy en la página de la tienda
    When me logueo con mi usuario "antonieta82000@gmail.com" y clave "antonieta@8"
    And hago click en iniciar sesion
    Then he inicado correctamente sesion y se muestra el usuario "Maria Huaraca"
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito

    @Escenario2
    Scenario: Validación el inicio de sesion con un usuario y clave inválidos
      Given estoy en la página de la tienda
      When me logueo con mi usuario "antonieta2000@gmail.com" y clave "antonieta@"
      And hago click en iniciar sesion
      Then no he iniciado correctamente sesión

    @Escenario3
     Scenario: una categoria inexistente
      Given estoy en la página de la tienda
      When me logueo con mi usuario "antonieta82000@gmail.com" y clave "antonieta@8"
      And hago click en iniciar sesion
      Then he inicado correctamente sesion y se muestra el usuario "Maria Huaraca"
      When busco categoria "AUTOS"
      And presionar tecla enter
      Then se espera que se muestre un articulo


