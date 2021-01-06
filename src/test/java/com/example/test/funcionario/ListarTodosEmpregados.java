package com.example.test.funcionario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ListarTodosEmpregados {

	
	/*
	 * Classe de testes responsavel por listar todos os empregados da empresa
	 */

	@FindBy(how = How.XPATH, using="//a[@href = 'listarTodosOsEmpregados']") WebElement listarTodososEmpregados;
	@FindBy(how = How.XPATH, using = "//table[@name='listaDeEmpregados']") WebElement listaDeEmpregados;
	@FindBy(how = How.XPATH, using="//a[@href='paginaInicial']") WebElement voltarPaginaInicial;
	
	public void listaDeEmpregados() {
		listaDeEmpregados.click();
	}
	
	public void paginaInicial() {
		voltarPaginaInicial.click();
	}
}
