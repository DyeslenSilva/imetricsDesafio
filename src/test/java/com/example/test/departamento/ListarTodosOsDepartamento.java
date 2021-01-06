package com.example.test.departamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ListarTodosOsDepartamento {
	
	/*
	 * Classe de teste responsavel por listar todos os departamentos 
	 */
	

	@FindBy(how = How.XPATH , using = "//a[@href='listarTodosOsDepartamentos']") WebElement listarDepartamentos;
	@FindBy(how = How.XPATH , using = "//table[@name='listaDeDepartamentos']") WebElement listaDeDepartamentos;
	@FindBy(how = How.XPATH , using ="//a[@href='paginaInicial']") WebElement paginaInicial;
	
	public void listarTodosOsDepartamentos() {
		listarDepartamentos.click();
	}
	
	public void listaDeDepartamentos() {
		listaDeDepartamentos.click();
	}
	
	public void paginaInicial() {
		paginaInicial.click();
	}
}