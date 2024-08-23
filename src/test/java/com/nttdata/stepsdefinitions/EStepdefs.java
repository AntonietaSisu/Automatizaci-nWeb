package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ESteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class EStepdefs {
    private WebDriver driver;
    private ESteps ESteps(WebDriver driver){
        return new ESteps(driver);
    }

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        screenShot();
    }

    @When("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        ESteps eSteps = new ESteps(driver);
        eSteps.iniciarsesion();
        screenShot();
        eSteps.typeUser(user);
        screenShot();
        eSteps.typePassword(password);
        screenShot();
    }

    @And("hago click en iniciar sesion")
    public void hagoClickEnIniciarSesion() {
        ESteps eSteps = new ESteps(driver);
        eSteps.login();
        screenShot();
    }
    @Then("he inicado correctamente sesion y se muestra el usuario {string}")
    public void heInicadoCorrectamenteSesionYSeMuestraElUsuario(String nombreUsuario) {
        String title =  ESteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(nombreUsuario, title);
        screenShot();
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String arg0, String arg1) {
        ESteps eSteps2 = new ESteps(driver);
        screenShot();
        eSteps2.cat1();
        screenShot();
        eSteps2.cat2();
        screenShot();
        eSteps2.cat3();
        screenShot();
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int arg0) {
        ESteps eSteps2 = new ESteps(driver);
        eSteps2.cat4();
        screenShot();
        eSteps2.cat5();
        screenShot();
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
        String title2 =  ESteps(driver).getTitle2();
        Assertions.assertEquals("\uE876Producto añadido correctamente a su carrito de compra",title2);
        screenShot();
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        String precio = ESteps(driver).monto();
        Assertions.assertEquals("S/ 38.24",precio);
        screenShot();
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        ESteps eSteps2 = new ESteps(driver);
        eSteps2.finalizar();
        screenShot();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        ESteps eSteps2 = new ESteps(driver);
        Assertions.assertEquals("CARRITO",eSteps2.titlecarrito());
        screenShot();
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        String precio= ESteps(driver).endvalidacion();
        Assertions.assertEquals("Total (impuestos incl.)\nS/ 38.24",precio);
        screenShot();
    }

    @When("busco categoria {string}")
    public void buscoCategoria(String buscarP) {
        ESteps eSteps = new ESteps(driver);
        eSteps.buscador(buscarP);
        screenShot();
    }

    @And("presionar tecla enter")
    public void presionarTeclaEnter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        screenShot();
        
    }

    @Then("se espera que se muestre un articulo")
    public void seEsperaQueSeMuestreUnArticulo() {
        ESteps eSteps = new ESteps(driver);
        eSteps.validararticulo();
        Assertions.assertEquals(true, eSteps.validararticulo(),"fallo a");
        screenShot();
    }
}
