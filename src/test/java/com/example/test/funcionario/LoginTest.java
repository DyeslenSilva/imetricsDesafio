package com.example.test.funcionario;

import org.openqa.selenium.support.PageFactory;

class LoginTest extends TestPage {

	/*
	 * Classe de teste responsavelpelo teste de login do 
	 * empregado
	 */
	
	
	public void init (String email, String senha) {
		LoginEmpregado loginEmpregado = PageFactory.initElements(driver, LoginEmpregado.class);
		loginEmpregado.setEmail(email);
		loginEmpregado.setPassword(senha);
		loginEmpregado.clicarNoBotaoEntrar();
		
	}
}
