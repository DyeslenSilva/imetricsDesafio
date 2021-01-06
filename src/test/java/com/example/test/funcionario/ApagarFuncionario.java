package com.example.test.funcionario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ApagarFuncionario {

	
	/*
	 * Classe de teste responsavel por apagar um funcionario
	 */
	
	private WebDriver drive;
	
	public ApagarFuncionario(WebDriver driver) {
		this.drive = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//[@type='number'][@name='txIdFuncionario']") WebElement txIdFuncionario;
	@FindBy(how = How.XPATH , using= "//[@type='button'][@name='btApagarFuncionario']") WebElement btApagar;
	
	
	public void apagarFuncionario () {
		btApagar.click();
	}
	
	

}
