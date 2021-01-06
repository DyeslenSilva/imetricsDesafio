package com.example.test.funcionario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class PaginaInicial {

	private WebDriver webDriver;
	
	/*
	 * Classe de teste da pagina inicial
	 */
	
	public PaginaInicial(WebDriver driver) {
		this.webDriver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//a[href='cadastroDeEmpregados']") WebElement cadastroDeEmpregados;
	@FindBy(how = How.XPATH, using="//a[href='loginDeEmpregados']") WebElement loginDeEmpregados;
	@FindBy(how = How.XPATH, using="//a[href='listAllEmpregados']") WebElement listAllEmpregaddos;
	@FindBy(how = How.XPATH, using = "//a[href='listEmpregadosById']") WebElement listEmpregadosById;
	@FindBy(how = How.XPATH, using="//a[href='alterar']") WebElement alterarEmpregado;
	@FindBy(how = How.XPATH, using="//a[href='deletar']") WebElement deletarEmpregado;
	
	public void clickOnCadastroDeEmpregados() {
		cadastroDeEmpregados.click();
	}
	
	public void clickOnLoginDeEmpregados() {
		loginDeEmpregados.click();
	}
	
	public void clickOnListAllEmpregados() {
		loginDeEmpregados.click();
	}
	
	public void clickOnListEmpregadosById() {
		listEmpregadosById.click();
	}
	
	
	public void clickOnAlterar() {
		alterarEmpregado.click();
	}
	
	
	public void clickOnDeletar() {
		deletarEmpregado.click();
	}
	


}
