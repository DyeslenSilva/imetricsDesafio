package com.example.test.departamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ListarDepartamentoPorID {

	/*
	 * Classe de teste responsavel por listar um departamento por ID
	 */
	
	
	@FindBy(how = How.XPATH, using = "//input[@type='number'][@name='txIdDepartamento']") WebElement idDepartamento;
	@FindBy(how = How.XPATH, using = "//input[@type='submit'][@name='listarDepartamento']") WebElement listarDepartamento;
	@FindBy(how = How.XPATH, using="//table[@name='table']") WebElement table;
	
	public void idDepartamento(CharSequence[] departamentoId) {
		idDepartamento.sendKeys(departamentoId);
	}
	
	public void listarPorId() {
		listarDepartamento.click();
	}
	
	public void mostrarLista() {
		listarDepartamento.getSize();
	}
	
}
