package com.example.test.departamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class AlterarCadastro {

	/*
	 * Classe reponsavel pelo teste de Alterar Cadastro
	 */
	
	@FindBy(how = How.XPATH , using = "//[@type='text'][@name='local']") WebElement local;
	@FindBy(how = How.XPATH , using = "//[@type='text'][@name=''nomeDoDepartamento]") WebElement nomeDoDepartamento;
	@FindBy(how = How.XPATH, using="//[@type='text'][@name='orcamento']") WebElement orcamento;
	
	public void alterarLocal(String localDepartamento) {
		local.sendKeys(localDepartamento);
	}
	
	public void alterarNomeDoDepartamento(String nomeDoDepartamento) {
		this.nomeDoDepartamento.sendKeys(nomeDoDepartamento);
	}
	
	public void alterarOrcamento(String orcamento) {
		this.orcamento.sendKeys(orcamento);
	}
	
	
}
