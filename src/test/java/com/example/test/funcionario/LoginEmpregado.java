package com.example.test.funcionario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class LoginEmpregado {

	/*
	 * Classe de teste responsavel pelo login do empregado
	 */
	
	private WebDriver webDriver;
	
	public LoginEmpregado(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(how = How.XPATH, using ="//input[@type='text'][@name='login']") WebElement loginTextBox;
	@FindBy(how = How.XPATH, using = "//input[@type='password'][@name='senha']" ) WebElement senhaTextBox;
	@FindBy(how = How.XPATH, using = "//input[type='submit'][@name='entrar']") WebElement botaoLogin;
	
	public void setEmail(String email) {
		loginTextBox.sendKeys(email);
	}
	
	public void setPassword(String password) {
		senhaTextBox.sendKeys(password);
	}
	
	public void clicarNoBotaoEntrar() {
		botaoLogin.click();
	}
	
}
