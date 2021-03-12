package com.prueba.comprueba1.definition;

import com.prueba.comprueba1.steps.prueba1Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class prueba1Definition {
	
	@Steps
	prueba1Steps Prueba1Steps;	
	
	@Given("^Ingresar al sitio Web$")
	public void ingresar_al_sitio_Web(){
		Prueba1Steps.iniciarPagina();
	}
	@Given("^Indicando una ciudad y el tipo de usuario$")
	public void indicando_una_ciudad_y_el_tipo_de_usuario() {
		Prueba1Steps.seleccionarCiudades();
		Prueba1Steps.buscarCiudad();
		Prueba1Steps.seleccionTipoUsuario();
	}

	@When("^Cliente ingresa la informacion de su \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void cliente_ingresa_la_informacion_de_su(String numTel, String nombre, String apellido, String email) {
		Prueba1Steps.ingresoNumTel(numTel);
		Prueba1Steps.aceptacionTerminos();
		Prueba1Steps.aceptacionTrataDatos();
		Prueba1Steps.seleccionarContinuar();
		Prueba1Steps.ingresarNombre(nombre);
		Prueba1Steps.ingresarApellido(apellido);
		Prueba1Steps.ingresarCorreo(email);
		Prueba1Steps.seleccionarSiguiente();
	}
	
	@When("^Los datos de recepcion del pedido (.*)$")
	public void los_datos_de_recepcion_del_pedido(String direccion) {
	    Prueba1Steps.indicarDireccion();
	    Prueba1Steps.insertarDireccion(direccion);
	}

	@Then("^confirme que se muestre el mensaje exitoso$")
	public void confirme_que_se_muestre_el_mensaje_exitoso() {
		Prueba1Steps.confirmacionRegistro();
	}


}
