package com.prueba.comprueba1.steps;

import com.prueba.comprueba1.pageObject.prueba1PageObject;

import net.thucydides.core.annotations.Step;

public class prueba1Steps {
	
	prueba1PageObject Prueba1PageObject;
	@Step
	public void iniciarPagina() {
		Prueba1PageObject.iniciarPagina();
	}
	@Step
	public void seleccionarCiudades() {
		Prueba1PageObject.seleccionarCiudades();
	}
	@Step
	public void buscarCiudad() {
		Prueba1PageObject.buscarCiudad();
	}
	@Step
	public void seleccionTipoUsuario() {
		Prueba1PageObject.selecTipoUsu();
	}
	@Step
	public void ingresoNumTel(String numTel) {
		Prueba1PageObject.ingresarNumTel(numTel);
	}
	@Step
	public void aceptacionTerminos() {
		Prueba1PageObject.selecTermCond();
	}
	@Step
	public void aceptacionTrataDatos() {
		Prueba1PageObject.selecAcepDatos();
	}
	
	public void seleccionarContinuar() {
		Prueba1PageObject.seleccionarContinuar();
	}
	
	public void ingresarNombre(String nombre) {
		Prueba1PageObject.ingresarNombre(nombre);
	}
	public void ingresarApellido(String apellido) {
		Prueba1PageObject.ingresarApellido(apellido);
	}
	public void ingresarCorreo(String email) {
		Prueba1PageObject.ingresarCorreo(email);
	}
	
	public void seleccionarSiguiente() {
		Prueba1PageObject.seleccionarSiguiente();
	}
	
	public void indicarDireccion() {
		Prueba1PageObject.indicarDireccion();
	}
	
	public void insertarDireccion(String direccion) {
		Prueba1PageObject.insertarDireccion(direccion);
	}
	
	public void confirmacionRegistro() {
		Prueba1PageObject.confirmacionTransaccion();
	}

}
