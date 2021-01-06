package com.example.test.funcionario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class AlterarCadastro {


	/*
	 * Classe de teste para alterar cadastro do funcionario
	 */
	
	private WebDriver webDriver; 
		
	public AlterarCadastro(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(how = How.XPATH , using = "//input[@type='text'][@name='txIdDepartamento']") WebElement txIdDepartamento;
	@FindBy(how = How.XPATH , using = "//input[@type='text'][@name='txNomeDoEmpregado']") WebElement txNome;
	@FindBy(how = How.XPATH, using = "//input[@type='text'][@name='txCpf']") WebElement txCPF;
	@FindBy(how = How.XPATH , using = "//input[@type='text'][@name='txTipoDeContratacao']") WebElement txTipoDeContratacao;
	@FindBy(how = How.XPATH, using="//input[@type='text'][@name='txAdmissao]")WebElement txAdmissao;
	
	@FindBy(how = How.XPATH , using ="//input[@type='text'][@name='txSexo']")WebElement txSexo;
	@FindBy(how = How.XPATH , using = "//input[@type='text'][@name='txCargo']")WebElement txCargo;
	@FindBy(how = How.XPATH , using = "//input[@type='text'][@name='txSalario']")WebElement txSalario;
	@FindBy(how = How.XPATH , using ="//input[@type='text'][@name='txComissao']")WebElement txComissao;

		
//	public void alterarID(CharSequence[] id) {
//		txIdDepartamento.sendKeys(id);
//	}

	
	public void alterarNome(String nomeEmpregado) {
		txNome.sendKeys(nomeEmpregado);
	}
	
	public void alterarCpf(String cpf) {
		txCPF.sendKeys(cpf);
	}
	
	public void alterarTipoDeContratacao(String tipoDeContratacao) {
		txTipoDeContratacao.sendKeys(tipoDeContratacao);
	}
	
	public void alterarAdmissao(String admissao) {
		txAdmissao.sendKeys(admissao);
	}
	
	public void alterarSexo(String sexo) {
		txSexo.sendKeys(sexo);
	}
	
	public void alterarCargo(String cargo) {
		txCargo.sendKeys(cargo);
	}
	
	public void alterarSalario(String salario) {
		txSalario.sendKeys(salario);
	}
	
	public void alterarComissao(String comissao) {
		txComissao.sendKeys(comissao);
	}
	

}
