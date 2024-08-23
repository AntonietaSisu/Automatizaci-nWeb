package com.nttdata.steps;

import com.nttdata.page.Epage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ESteps {
    private WebDriver driver;

    //constructor
    public ESteps(WebDriver driver){
        this.driver = driver;
    }
    public void iniciarsesion(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.iniciarcesion));
        this.driver.findElement(Epage.iniciarcesion).click();
    }

    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(Epage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.loginButton));
    }

    public void typePassword(String password){
        this.driver.findElement(Epage.passwordInput).sendKeys(password);}

    public void login(){
        this.driver.findElement(Epage.loginButton).click();}

    public String getTitle(){
        return this.driver.findElement(Epage.comparacion).getText();}

    public void cat1(){
        this.driver.findElement(Epage.clickcat).click();}

    public void cat2(){
        this.driver.findElement(Epage.clickcat2).click();}

    public void cat3(){
        this.driver.findElement(Epage.clickart).click();}

    public boolean validararticulo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement validacionarticulo = wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.clickart));
        return validacionarticulo.isEnabled();
    }

    public void cat4(){
        this.driver.findElement(Epage.clickañadir).click();}

    public void cat5(){
        this.driver.findElement(Epage.clickcarrito).click();}

    public String getTitle2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tituloPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.comparacion2));
        String texto = tituloPopup.getText();
        return texto;
    }

    public String monto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement precioel = wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.montoTotal));
        String precio = precioel.getText();
        return precio;
    }
    public void finalizar(){
        this.driver.findElement(Epage.fincompra).click();}

    public String titlecarrito(){
        return this.driver.findElement(Epage.tituloCarrito).getText();}

    public String endvalidacion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement precioel = wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.ultimavalidacion));
        String preciofinal = precioel.getText();
        return preciofinal;
    }
    public void buscador(String buscar){

        WebElement userInputElement = driver.findElement(Epage.buscadorb);
        userInputElement.sendKeys(buscar);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Epage.buscadorb));

    }


}

