package com.example.test.departamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ApagarDepartamento {
	
	/*
	 * Classe de teste responsavel por apagar um departamento
	 */

	@FindBy(how = How.XPATH, using = "//[@type='number'][@name='idDepartamento']") WebElement idDepartamento;
	@FindBy(how = How.XPATH , using = "//[@type='button'][@name='apagarDepartameto']") WebElement apagarDepartamento;
	
	public void apagarDepartamento() {
		apagarDepartamento.click();
	}
	
}
