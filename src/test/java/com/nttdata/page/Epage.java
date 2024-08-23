package com.nttdata.page;

import org.openqa.selenium.By;

public class Epage {
    //Localizadores de elementos


    public static By iniciarcesion = By.xpath("//span[contains(text(),'Iniciar sesión')]");
    public static By userInput = By.xpath("//input[@id='field-email']");
    public static By passwordInput = By.xpath("//input[@id='field-password']");

    public static By loginButton = By.xpath("//button[@id='submit-login']");

    public static By comparacion = By.xpath("//span[contains(text(),'Maria Huaraca')]");

    public static By clickcat =By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");
    public static By clickcat2 = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    public static By clickart = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]");

    public static By clickañadir = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/span[3]/button[1]/i[1]");
    public static By clickcarrito = By.xpath("//i[contains(text(),'\uE547')]");
    public static By comparacion2 = By.xpath("//h4[@id='myModalLabel']");
    public static By montoTotal = By.xpath("//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[4]/span[2]");
    public static By fincompra = By.xpath("//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]");
    public static By tituloCarrito = By.xpath("//h1[contains(text(),'Carrito')]");
    public static By ultimavalidacion = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]");

    public static By buscadorb = By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/input[2]");


}
