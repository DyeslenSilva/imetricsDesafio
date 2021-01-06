package com.example.test.funcionario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ListarPorID {
	
	/*
	 * Classe de teste resonsavel por listar um funcionario pelo ID
	 */

	private WebDriver driver;
	
	public ListarPorID(WebDriver wbD) {
		this.driver = wbD;
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@number][@idEmpregado]") WebElement empregadoId;
	@FindBy(how = How.XPATH, using = "//input[@submit][@consutarEmpregado]") WebElement consultarEmpregado;
	@FindBy(how = How.XPATH, using = "//table[][@listaDeEmpregados]") WebElement listaDeEmpregados;
	
	
	public void setIdEmpregado(CharSequence[] idEmpregado) {
		empregadoId.sendKeys(idEmpregado);
	}
	
	public void consultarEmpregado() {
		consultarEmpregado.click();
	}
	
	
	public void mostrarLista() {
		listaDeEmpregados.getSize();
	}
}
