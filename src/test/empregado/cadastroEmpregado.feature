@CadastroDeEmpregados

Feature: Cadastro de Empregados
	
	As a user of the system
	I want to register a employee
	
	Background: Use navigates to register employess
		Given I am on the "Cadastrar Empreados" page on URL ""
		Then I should see the page to register employess
		
	Scenario: Succefull Registered
		When eu preencho "nome" com "Dyeslen"
		And eu preencho "cpf" com "293.392.324-02"
		And eu preencho 	"sexo" com "Masculino"
		And eu preencho "cargo" com "Desenvolvedor"
		And eu preencho "admissao" com "17/01/2021" 
		And eu preencho "departamentoId"  com 12
		And eu preencho "salario"  com "R$2500,00" 
		And eu preencho "comissao" com "R$240,00"
		And eu preencho "tipoContratacao" com "CLT"
		 
		
		Then the system should redirect to the page "Registred Succefully"
		And the system return to the homepage

	Scenario Outline: Failed Registred using wrong character
		When I dont fill the TextBox
		And I fill "nome" with "<nome>"
		And I fill "cpf" with "<cpf>"
		And I fill 	"sexo" with "<sexo>"
		And I fill "cargo" with "<cargo>"
		And I fill "admissao" with with "<admissao>" 
		And I fill "departamentoId"  with "<departamentoId>"
		And I fill "salario"  with "<salario>" 
		And I fill "comissao" with "<comissao>"
		And I fill "tipoContratacao" with "<tipoContratacao>"
		And I should see "<warning>" message
		Then the system should redirect to the page "Registred Failed"
		
		And I should see "<warning>" message
		Then the system should redirect to the page "Registred Failed"
		