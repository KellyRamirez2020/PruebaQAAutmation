package com.prueba.comprueba1.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;


public class prueba1PageObject extends PageObject{
	
	public static WebDriver driver;
		
	public void iniciarPagina() {
		System.setProperty("webdriver.chrome.driver","C:/Users/mayo1/Documents/prueba/com.prueba1/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://co-tc-shopper-web-stage.serempre.dev/");
		
		
	}
	
	public void seleccionarCiudades() {
		WebElement  btnCiudad = driver.findElement(By.id("cityLocation"));
		btnCiudad.click();
	}
	
	public void buscarCiudad() {
		driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys("Bogota"+ Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/button")).click();
	}
	
	public void selecTipoUsu() {
		WebElement usu =(new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div[1]/main/div/div/div[2]/div[2]/div[1]/button")));
		usu.click();
		
		
	}
	
	public void ingresarNumTel(String numTel) {
		driver.findElement(By.id("abi-phone")).sendKeys(numTel);
		WebElement btnIngresar = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/button"));
		btnIngresar.click();
	}
	
	public void selecTermCond() {
		WebElement btnTermCond = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.id("abi-checkbox-terms")));
		btnTermCond.click();
	}
	
	public void selecAcepDatos() {
		WebElement btnAcepDatos = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.id("abi-checkbox-policies")));
		btnAcepDatos.click();
	}
	
	public void seleccionarContinuar() {
		WebElement btnContinuar = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[3]/button"));
		btnContinuar.click();
		
	}
	
	public void ingresarNombre(String nombre) {
		driver.findElement(By.id("register-name")).sendKeys(nombre);
	}
	
	public void ingresarApellido(String apellido) {
		driver.findElement(By.id("register-lastName")).sendKeys(apellido);
	}
	
	public void ingresarCorreo(String email) {
		driver.findElement(By.id("register-email")).sendKeys(email);
	}
	
	public void seleccionarSiguiente() {
		WebElement btnSiguiente = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div/button"));
		btnSiguiente.click();
	}
	
	public void indicarDireccion() {
		WebElement btnDireccion = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[1]/div/div/div[2]/div/div[1]/button"));
		btnDireccion.click();
	}
	
	public void insertarDireccion(String direccion) {
		WebElement lblDireccion = driver.findElement(By.id("address"));
		lblDireccion.sendKeys(direccion);
		WebElement regDir = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"html\"]/body/div[3]/div[3]/div/div/div[2]/div/form[1]/div/div[2]/ul/li")));
		regDir.click();
		WebElement btnSelecDir = driver.findElement(By.xpath("//*[@id=\"html\"]/body/div[3]/div[3]/div/div/div[2]/div/form[2]/button"));
		btnSelecDir.click();
	}
	
	public void confirmacionTransaccion() {
		driver.quit();
	}
	

}
