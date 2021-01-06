package com.example.test.funcionario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class CadastroDeUsuarios {
	
	/*
	 * Classe de teste responsavel pelo cadastro dos usuarios (Funcionarios)
	 */
	
	
	private WebDriver webDriver;


	public CadastroDeUsuarios(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public CadastroDeUsuarios nomeEmpregado(String nomeFuncionario, String funcHTML) {
		webDriver.findElement(By.name(funcHTML)).sendKeys(nomeFuncionario);
		return this;
	}
	
	public CadastroDeUsuarios salarioEmpregado(String salario, String salarioHTML) {
		webDriver.findElement(By.name(salarioHTML)).sendKeys(salario);
		return this;
	}
	
	public CadastroDeUsuarios sexoUsuario(String sexo, String sexoHTML) {
		webDriver.findElement(By.name(sexoHTML)).sendKeys(sexo);
		return this;
	}
	
	public CadastroDeUsuarios tipoDeContratacao(String tipoDeContratacao, String tipoContHTML) {
		webDriver.findElement(By.name(tipoContHTML)).sendKeys(tipoDeContratacao);
		return this;
	}
	
	public CadastroDeUsuarios admissao(String admissao, String admissaoHTML) {
		webDriver.findElement(By.name(admissaoHTML)).sendKeys(admissao);
		return this;
	}
	
	public CadastroDeUsuarios cargo(String cargo, String cargoHTML) {
		webDriver.findElement(By.name(cargoHTML)).sendKeys(cargo);
		return this;
	}
	
	
	public CadastroDeUsuarios comissao(String comissao, String comissaoHTML) {
		webDriver.findElement(By.name(comissaoHTML)).sendKeys(comissao);
		return this;
	}
	
	public CadastroDeUsuarios cpf(String cpf, String cpfHTML) {
		webDriver.findElement(By.name(cpfHTML)).sendKeys(cpf);
		return this;
	}
	
	public CadastroDeUsuarios cadastrar(String cssSeletor) {
		webDriver.findElement(By.cssSelector(cssSeletor)).click();
		return new CadastroDeUsuarios(webDriver);
	}
}
