package com.prueba.comprueba1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/prueba.feature", tags="@tag2")

public class AppTest 
{

}
