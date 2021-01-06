package com.example.test.departamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class CadastrarDepartamento {
	
	/*
	 * Classe de teste responsavel por cadastrar um departamento
	 */

	private WebDriver webDriver;
	
	public CadastrarDepartamento nomeDepartamento(String nomeDepartamento, String htmlNome) {
		webDriver.findElement(By.id(htmlNome)).sendKeys(nomeDepartamento);
		return this;
	}
	
	public CadastrarDepartamento localDepartamento(String localDepartamento, String htmlLocal) {
		webDriver.findElement(By.id(htmlLocal)).sendKeys(localDepartamento);
		return this;
	}
	
	public CadastrarDepartamento orcamento(String orcamento, String htmlOrcamento) {
		webDriver.findElement(By.id(htmlOrcamento)).sendKeys(orcamento);
		return this;
	}
	
}
