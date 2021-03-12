@tag
Feature: permitir el diligenciamiento del formulario


  @tag2
  Scenario Outline: Permitir al usuario diligenciar el formulario por el pais seleccionado
    Given Ingresar al sitio Web
    	And Indicando una ciudad y el tipo de usuario
    When Cliente ingresa la informacion de su <numTel><nombre><apellido><correo>
    	And Los datos de recepcion del pedido <direccion>
    Then confirme que se muestre el mensaje exitoso

    Examples: 
      |ciudad|numTel|nombre|apellido|correo|direccion|
      |"Bogota"|"12345688"|"Juana"|"Pruebas"|"juanprueba@algoo.com"|"Cra. 13 #96-67"|
